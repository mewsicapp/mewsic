package org.mewsic.jaad.mp4.boxes.impl

import org.mewsic.jaad.mp4.MP4InputStream
import org.mewsic.jaad.mp4.boxes.FullBox

/**
 * The sound media header contains general presentation information, independent
 * of the coding, for audio media. This header is used for all tracks containing
 * audio.
 *
 * @author in-somnia
 */
class SoundMediaHeaderBox : FullBox("Sound Media Header Box") {
    /**
     * The balance is a floating-point number that places mono audio tracks in a
     * stereo space: 0 is centre (the normal value), full left is -1.0 and full
     * right is 1.0.
     *
     * @return the stereo balance for a mono track
     */
    var balance = 0.0
        private set

    @Throws(Exception::class)
    override fun decode(`in`: MP4InputStream) {
        super.decode(`in`)
        balance = `in`.readFixedPoint(8, 8)
        `in`.skipBytes(2) //reserved
    }
}
