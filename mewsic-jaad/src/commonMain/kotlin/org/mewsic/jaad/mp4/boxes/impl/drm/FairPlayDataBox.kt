package org.mewsic.jaad.mp4.boxes.impl.drm

import org.mewsic.jaad.mp4.MP4InputStream
import org.mewsic.jaad.mp4.boxes.BoxImpl

class FairPlayDataBox : BoxImpl("iTunes FairPlay Data Box") {
    lateinit var data: ByteArray
        private set

    @Throws(Exception::class)
    override fun decode(`in`: MP4InputStream) {
        super.decode(`in`)
        data = ByteArray(getLeft(`in`).toInt())
        `in`.readBytes(data)
    }
}
