package org.mewsic.jaad.mp4.boxes.impl.meta

import org.mewsic.jaad.mp4.MP4InputStream
import org.mewsic.jaad.mp4.boxes.FullBox

/**
 * This box is used in custom metadata tags (within the box-type '----'). It
 * contains the name of the custom tag, whose data is stored in the 'data'-box.
 *
 * @author in-somnia
 */
class ITunesMetadataNameBox : FullBox("iTunes Metadata Name Box") {
    var metaName: String? = null
        private set

    @Throws(Exception::class)
    override fun decode(`in`: MP4InputStream) {
        super.decode(`in`)
        metaName = `in`.readString(getLeft(`in`).toInt())
    }
}
