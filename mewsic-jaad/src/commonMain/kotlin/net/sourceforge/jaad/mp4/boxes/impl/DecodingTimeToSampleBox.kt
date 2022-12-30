package net.sourceforge.jaad.mp4.boxes.impl
import net.sourceforge.jaad.mp4.boxes.BoxImpl

import net.sourceforge.jaad.mp4.boxes.FullBox

/**
 * This box contains a compact version of a table that allows indexing from
 * decoding time to sample number. Other tables give sample sizes and pointers,
 * from the sample number. Each entry in the table gives the number of
 * consecutive samples with the same time delta, and the delta of those samples.
 * By adding the deltas a complete time-to-sample map may be built.
 * The Decoding Time to Sample Box contains decode time delta's:
 * DT(n+1) = DT(n) + STTS(n)
 * where STTS(n) is the (uncompressed) table entry for sample n.
 * The sample entries are ordered by decoding time stamps; therefore the deltas
 * are all non-negative.
 * The DT axis has a zero origin; DT(i) = SUM(for j=0 to i-1 of delta(j)), and
 * the sum of all deltas gives the length of the media in the track (not mapped
 * to the overall timescale, and not considering any edit list).
 * The Edit List Box provides the initial CT value if it is non-empty
 * (non-zero).
 *
 * @author in-somnia
 */
class DecodingTimeToSampleBox : FullBox("Time To Sample Box") {
    var sampleCounts: LongArray
        private set
    var sampleDeltas: LongArray
        private set

    @Throws(Exception::class)
    override override fun decode(`in`: MP4InputStream) {
        super.decode(`in`)
        val entryCount = `in`.readBytes(4) as Int
        sampleCounts = LongArray(entryCount)
        sampleDeltas = LongArray(entryCount)
        for (i in 0 until entryCount) {
            sampleCounts[i] = `in`.readBytes(4)
            sampleDeltas[i] = `in`.readBytes(4)
        }
    }
}
