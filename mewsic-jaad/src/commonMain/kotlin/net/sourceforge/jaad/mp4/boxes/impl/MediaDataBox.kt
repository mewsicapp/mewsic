package net.sourceforge.jaad.mp4.boxes.impl

import net.sourceforge.jaad.mp4.boxes.BoxImpl

/**
 * The Media Data Box contains the media data. In video tracks, this box would
 * contain video frames. A presentation may contain zero or more Media Data
 * Boxes. The actual media data follows the type field; its structure is
 * described by the metadata in the movie box.
 * There may be any number of these boxes in the file (including zero, if all
 * the media data is in other files). The metadata refers to media data by its
 * absolute offset within the file.
 * @author in-somnia
 */
class MediaDataBox : BoxImpl("Media Data Box") {
    @Throws(java.io.IOException::class)
    override fun decode(`in`: MP4InputStream?) {
        //if random access: skip, else: do nothing
    }
}
