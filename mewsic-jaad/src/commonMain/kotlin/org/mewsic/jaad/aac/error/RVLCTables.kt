package org.mewsic.jaad.aac.error

internal interface RVLCTables {
    companion object {
        //index,length,codeword
        val RVLC_BOOK = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(-1, 3, 5),
            intArrayOf(1, 3, 7),
            intArrayOf(-2, 4, 9),
            intArrayOf(-3, 5, 17),
            intArrayOf(2, 5, 27),
            intArrayOf(-4, 6, 33),
            intArrayOf(99, 6, 50),
            intArrayOf(3, 6, 51),
            intArrayOf(99, 6, 52),
            intArrayOf(-7, 7, 65),
            intArrayOf(99, 7, 96),
            intArrayOf(99, 7, 98),
            intArrayOf(7, 7, 99),
            intArrayOf(4, 7, 107),
            intArrayOf(-5, 8, 129),
            intArrayOf(99, 8, 194),
            intArrayOf(5, 8, 195),
            intArrayOf(99, 8, 212),
            intArrayOf(99, 9, 256),
            intArrayOf(-6, 9, 257),
            intArrayOf(99, 9, 426),
            intArrayOf(6, 9, 427),
            intArrayOf(99, 10, 0)
        )
        val ESCAPE_BOOK = arrayOf(
            intArrayOf(1, 2, 0),
            intArrayOf(0, 2, 2),
            intArrayOf(3, 3, 2),
            intArrayOf(2, 3, 6),
            intArrayOf(4, 4, 14),
            intArrayOf(7, 5, 13),
            intArrayOf(6, 5, 15),
            intArrayOf(5, 5, 31),
            intArrayOf(11, 6, 24),
            intArrayOf(10, 6, 25),
            intArrayOf(9, 6, 29),
            intArrayOf(8, 6, 61),
            intArrayOf(13, 7, 56),
            intArrayOf(12, 7, 120),
            intArrayOf(15, 8, 114),
            intArrayOf(14, 8, 242),
            intArrayOf(17, 9, 230),
            intArrayOf(16, 9, 486),
            intArrayOf(19, 10, 463),
            intArrayOf(18, 10, 974),
            intArrayOf(22, 11, 925),
            intArrayOf(20, 11, 1950),
            intArrayOf(21, 11, 1951),
            intArrayOf(23, 12, 1848),
            intArrayOf(25, 13, 3698),
            intArrayOf(24, 14, 7399),
            intArrayOf(26, 15, 14797),
            intArrayOf(49, 19, 236736),
            intArrayOf(50, 19, 236737),
            intArrayOf(51, 19, 236738),
            intArrayOf(52, 19, 236739),
            intArrayOf(53, 19, 236740),
            intArrayOf(27, 20, 473482),
            intArrayOf(28, 20, 473483),
            intArrayOf(29, 20, 473484),
            intArrayOf(30, 20, 473485),
            intArrayOf(31, 20, 473486),
            intArrayOf(32, 20, 473487),
            intArrayOf(33, 20, 473488),
            intArrayOf(34, 20, 473489),
            intArrayOf(35, 20, 473490),
            intArrayOf(36, 20, 473491),
            intArrayOf(37, 20, 473492),
            intArrayOf(38, 20, 473493),
            intArrayOf(39, 20, 473494),
            intArrayOf(40, 20, 473495),
            intArrayOf(41, 20, 473496),
            intArrayOf(42, 20, 473497),
            intArrayOf(43, 20, 473498),
            intArrayOf(44, 20, 473499),
            intArrayOf(45, 20, 473500),
            intArrayOf(46, 20, 473501),
            intArrayOf(47, 20, 473502),
            intArrayOf(48, 20, 473503),
            intArrayOf(99, 21, 0)
        )
    }
}
