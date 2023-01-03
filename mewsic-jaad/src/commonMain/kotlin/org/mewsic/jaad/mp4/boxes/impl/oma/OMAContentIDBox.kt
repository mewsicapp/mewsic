package org.mewsic.jaad.mp4.boxes.impl.oma

import org.mewsic.jaad.mp4.MP4InputStream
import org.mewsic.jaad.mp4.boxes.FullBox

/**
 * The ContentID box contains the unique identifier for the Content Object the
 * metadata are associated with. The value of the content-ID must be the value
 * of the content-ID stored in the Common Headers for this Content Object. There
 * must be exactly one ContentID sub-box per User-Data box, as the first sub-box
 * in the container.
 *
 * @author in-somnia
 */
class OMAContentIDBox : FullBox("OMA DRM Content ID Box") {
    /**
     * Returns the content-ID string.
     *
     * @return the content-ID
     */
    var contentID: String? = null
        private set

    @Throws(Exception::class)
    override fun decode(`in`: MP4InputStream) {
        super.decode(`in`)
        val len = `in`.readBytes(2).toInt()
        contentID = `in`.readString(len)
    }
}
