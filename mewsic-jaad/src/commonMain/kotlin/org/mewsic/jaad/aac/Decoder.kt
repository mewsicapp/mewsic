package org.mewsic.jaad.aac

import org.mewsic.jaad.aac.filterbank.FilterBank
import org.mewsic.jaad.aac.syntax.BitStream
import org.mewsic.jaad.aac.syntax.Constants
import org.mewsic.jaad.aac.syntax.PCE
import org.mewsic.jaad.aac.syntax.SyntacticElements
import org.mewsic.jaad.aac.transport.ADIFHeader

/**
 * Main AAC decoder class
 * @author in-somnia
 */
class Decoder(decoderSpecificInfo: ByteArray?) : Constants {
    val config: DecoderConfig?
    private val syntacticElements: SyntacticElements
    private val filterBank: FilterBank
    private val `in`: BitStream
    private var adifHeader: ADIFHeader? = null

    /**
     * Initializes the decoder with a MP4 decoder specific info.
     *
     * After this the MP4 frames can be passed to the
     * `decodeFrame(byte[], SampleBuffer)` method to decode them.
     *
     * @param decoderSpecificInfo a byte array containing the decoder specific info from an MP4 container
     * @throws AACException if the specified profile is not supported
     */
    init {
        config = DecoderConfig.parseMP4DecoderSpecificInfo(decoderSpecificInfo!!)
        if (config == null) throw IllegalArgumentException("illegal MP4 decoder specific info")
        if (!canDecode(config.getProfile())) throw AACException("unsupported profile: " + config.getProfile()!!.description)
        syntacticElements = SyntacticElements(config)
        filterBank = FilterBank(config.isSmallFrameUsed, config.getChannelConfiguration().channelCount)
        `in` = BitStream()
    }

    /**
     * Decodes one frame of AAC data in frame mode and returns the raw PCM
     * data.
     * @param frame the AAC frame
     * @param buffer a buffer to hold the decoded PCM data
     * @throws AACException if decoding fails
     */
    @Throws(AACException::class)
    fun decodeFrame(frame: ByteArray?, buffer: SampleBuffer) {
        if (frame != null) `in`.setData(frame)
        try {
            decode(buffer)
        } catch (e: AACException) {
            if (!e.isEndOfStream) throw e
        }
    }

    @Throws(AACException::class)
    fun decode(buffer: SampleBuffer) {
        if (ADIFHeader.isPresent(`in`)) {
            adifHeader = ADIFHeader.readHeader(`in`)
            val pce: PCE = adifHeader!!.firstPCE!!
            config!!.setProfile(pce.profile)
            config.setSampleFrequency(pce.sampleFrequency)
            config.setChannelConfiguration(ChannelConfiguration.forInt(pce.channelCount))
        }
        if (!canDecode(config!!.getProfile())) throw AACException("unsupported profile: " + config.getProfile()!!.description)
        syntacticElements.startNewFrame()
        try {
            //1: bitstream parsing and noiseless coding
            syntacticElements.decode(`in`)
            //2: spectral processing
            syntacticElements.process(filterBank)
            //3: send to output buffer
            syntacticElements.sendToOutput(buffer)
        } catch (e: AACException) {
            buffer.setData(ByteArray(0), 0, 0, 0, 0)
            throw e
        } catch (e: Exception) {
            buffer.setData(ByteArray(0), 0, 0, 0, 0)
            throw AACException(e)
        }
    }

    companion object {
        /**
         * The methods returns true, if a profile is supported by the decoder.
         * @param profile an AAC profile
         * @return true if the specified profile can be decoded
         * @see Profile.isDecodingSupported
         */
        fun canDecode(profile: Profile?): Boolean {
            return profile!!.isDecodingSupported
        }
    }
}
