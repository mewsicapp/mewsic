package net.sourceforge.jaad.aac.sbr
import org.mewsic.commons.lang.Arrays

import org.mewsic.commons.streams.api.OutputStream
import org.mewsic.commons.streams.api.InputStream
internal interface HuffmanTables {
    companion object {
        val T_HUFFMAN_ENV_1_5DB = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(-64, -65),
            intArrayOf(3, 4),
            intArrayOf(-63, -66),
            intArrayOf(5, 6),
            intArrayOf(-62, -67),
            intArrayOf(7, 8),
            intArrayOf(-61, -68),
            intArrayOf(9, 10),
            intArrayOf(-60, -69),
            intArrayOf(11, 12),
            intArrayOf(-59, -70),
            intArrayOf(13, 14),
            intArrayOf(-58, -71),
            intArrayOf(15, 16),
            intArrayOf(-57, -72),
            intArrayOf(17, 18),
            intArrayOf(-73, -56),
            intArrayOf(19, 21),
            intArrayOf(-74, 20),
            intArrayOf(-55, -75),
            intArrayOf(22, 26),
            intArrayOf(23, 24),
            intArrayOf(-54, -76),
            intArrayOf(-77, 25),
            intArrayOf(-53, -78),
            intArrayOf(27, 34),
            intArrayOf(28, 29),
            intArrayOf(-52, -79),
            intArrayOf(30, 31),
            intArrayOf(-80, -51),
            intArrayOf(32, 33),
            intArrayOf(-83, -82),
            intArrayOf(-81, -50),
            intArrayOf(35, 57),
            intArrayOf(36, 40),
            intArrayOf(37, 38),
            intArrayOf(-88, -84),
            intArrayOf(-48, 39),
            intArrayOf(-90, -85),
            intArrayOf(41, 46),
            intArrayOf(42, 43),
            intArrayOf(-49, -87),
            intArrayOf(44, 45),
            intArrayOf(-89, -86),
            intArrayOf(-124, -123),
            intArrayOf(47, 50),
            intArrayOf(48, 49),
            intArrayOf(-122, -121),
            intArrayOf(-120, -119),
            intArrayOf(51, 54),
            intArrayOf(52, 53),
            intArrayOf(-118, -117),
            intArrayOf(-116, -115),
            intArrayOf(55, 56),
            intArrayOf(-114, -113),
            intArrayOf(-112, -111),
            intArrayOf(58, 89),
            intArrayOf(59, 74),
            intArrayOf(60, 67),
            intArrayOf(61, 64),
            intArrayOf(62, 63),
            intArrayOf(-110, -109),
            intArrayOf(-108, -107),
            intArrayOf(65, 66),
            intArrayOf(-106, -105),
            intArrayOf(-104, -103),
            intArrayOf(68, 71),
            intArrayOf(69, 70),
            intArrayOf(-102, -101),
            intArrayOf(-100, -99),
            intArrayOf(72, 73),
            intArrayOf(-98, -97),
            intArrayOf(-96, -95),
            intArrayOf(75, 82),
            intArrayOf(76, 79),
            intArrayOf(77, 78),
            intArrayOf(-94, -93),
            intArrayOf(-92, -91),
            intArrayOf(80, 81),
            intArrayOf(-47, -46),
            intArrayOf(-45, -44),
            intArrayOf(83, 86),
            intArrayOf(84, 85),
            intArrayOf(-43, -42),
            intArrayOf(-41, -40),
            intArrayOf(87, 88),
            intArrayOf(-39, -38),
            intArrayOf(-37, -36),
            intArrayOf(90, 105),
            intArrayOf(91, 98),
            intArrayOf(92, 95),
            intArrayOf(93, 94),
            intArrayOf(-35, -34),
            intArrayOf(-33, -32),
            intArrayOf(96, 97),
            intArrayOf(-31, -30),
            intArrayOf(-29, -28),
            intArrayOf(99, 102),
            intArrayOf(100, 101),
            intArrayOf(-27, -26),
            intArrayOf(-25, -24),
            intArrayOf(103, 104),
            intArrayOf(-23, -22),
            intArrayOf(-21, -20),
            intArrayOf(106, 113),
            intArrayOf(107, 110),
            intArrayOf(108, 109),
            intArrayOf(-19, -18),
            intArrayOf(-17, -16),
            intArrayOf(111, 112),
            intArrayOf(-15, -14),
            intArrayOf(-13, -12),
            intArrayOf(114, 117),
            intArrayOf(115, 116),
            intArrayOf(-11, -10),
            intArrayOf(-9, -8),
            intArrayOf(118, 119),
            intArrayOf(-7, -6),
            intArrayOf(-5, -4)
        )
        val F_HUFFMAN_ENV_1_5DB = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(-64, -65),
            intArrayOf(3, 4),
            intArrayOf(-63, -66),
            intArrayOf(5, 6),
            intArrayOf(-67, -62),
            intArrayOf(7, 8),
            intArrayOf(-68, -61),
            intArrayOf(9, 10),
            intArrayOf(-69, -60),
            intArrayOf(11, 13),
            intArrayOf(-70, 12),
            intArrayOf(-59, -71),
            intArrayOf(14, 16),
            intArrayOf(-58, 15),
            intArrayOf(-72, -57),
            intArrayOf(17, 19),
            intArrayOf(-73, 18),
            intArrayOf(-56, -74),
            intArrayOf(20, 23),
            intArrayOf(21, 22),
            intArrayOf(-55, -75),
            intArrayOf(-54, -53),
            intArrayOf(24, 27),
            intArrayOf(25, 26),
            intArrayOf(-76, -52),
            intArrayOf(-77, -51),
            intArrayOf(28, 31),
            intArrayOf(29, 30),
            intArrayOf(-50, -78),
            intArrayOf(-79, -49),
            intArrayOf(32, 36),
            intArrayOf(33, 34),
            intArrayOf(-48, -47),
            intArrayOf(-80, 35),
            intArrayOf(-81, -82),
            intArrayOf(37, 47),
            intArrayOf(38, 41),
            intArrayOf(39, 40),
            intArrayOf(-83, -46),
            intArrayOf(-45, -84),
            intArrayOf(42, 44),
            intArrayOf(-85, 43),
            intArrayOf(-44, -43),
            intArrayOf(45, 46),
            intArrayOf(-88, -87),
            intArrayOf(-86, -90),
            intArrayOf(48, 66),
            intArrayOf(49, 56),
            intArrayOf(50, 53),
            intArrayOf(51, 52),
            intArrayOf(-92, -42),
            intArrayOf(-41, -39),
            intArrayOf(54, 55),
            intArrayOf(-105, -89),
            intArrayOf(-38, -37),
            intArrayOf(57, 60),
            intArrayOf(58, 59),
            intArrayOf(-94, -91),
            intArrayOf(-40, -36),
            intArrayOf(61, 63),
            intArrayOf(-20, 62),
            intArrayOf(-115, -110),
            intArrayOf(64, 65),
            intArrayOf(-108, -107),
            intArrayOf(-101, -97),
            intArrayOf(67, 89),
            intArrayOf(68, 75),
            intArrayOf(69, 72),
            intArrayOf(70, 71),
            intArrayOf(-95, -93),
            intArrayOf(-34, -27),
            intArrayOf(73, 74),
            intArrayOf(-22, -17),
            intArrayOf(-16, -124),
            intArrayOf(76, 82),
            intArrayOf(77, 79),
            intArrayOf(-123, 78),
            intArrayOf(-122, -121),
            intArrayOf(80, 81),
            intArrayOf(-120, -119),
            intArrayOf(-118, -117),
            intArrayOf(83, 86),
            intArrayOf(84, 85),
            intArrayOf(-116, -114),
            intArrayOf(-113, -112),
            intArrayOf(87, 88),
            intArrayOf(-111, -109),
            intArrayOf(-106, -104),
            intArrayOf(90, 105),
            intArrayOf(91, 98),
            intArrayOf(92, 95),
            intArrayOf(93, 94),
            intArrayOf(-103, -102),
            intArrayOf(-100, -99),
            intArrayOf(96, 97),
            intArrayOf(-98, -96),
            intArrayOf(-35, -33),
            intArrayOf(99, 102),
            intArrayOf(100, 101),
            intArrayOf(-32, -31),
            intArrayOf(-30, -29),
            intArrayOf(103, 104),
            intArrayOf(-28, -26),
            intArrayOf(-25, -24),
            intArrayOf(106, 113),
            intArrayOf(107, 110),
            intArrayOf(108, 109),
            intArrayOf(-23, -21),
            intArrayOf(-19, -18),
            intArrayOf(111, 112),
            intArrayOf(-15, -14),
            intArrayOf(-13, -12),
            intArrayOf(114, 117),
            intArrayOf(115, 116),
            intArrayOf(-11, -10),
            intArrayOf(-9, -8),
            intArrayOf(118, 119),
            intArrayOf(-7, -6),
            intArrayOf(-5, -4)
        )
        val T_HUFFMAN_ENV_BAL_1_5DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-63, 2),
            intArrayOf(-65, 3),
            intArrayOf(-62, 4),
            intArrayOf(-66, 5),
            intArrayOf(-61, 6),
            intArrayOf(-67, 7),
            intArrayOf(-60, 8),
            intArrayOf(-68, 9),
            intArrayOf(10, 11),
            intArrayOf(-69, -59),
            intArrayOf(12, 13),
            intArrayOf(-70, -58),
            intArrayOf(14, 28),
            intArrayOf(15, 21),
            intArrayOf(16, 18),
            intArrayOf(-57, 17),
            intArrayOf(-71, -56),
            intArrayOf(19, 20),
            intArrayOf(-88, -87),
            intArrayOf(-86, -85),
            intArrayOf(22, 25),
            intArrayOf(23, 24),
            intArrayOf(-84, -83),
            intArrayOf(-82, -81),
            intArrayOf(26, 27),
            intArrayOf(-80, -79),
            intArrayOf(-78, -77),
            intArrayOf(29, 36),
            intArrayOf(30, 33),
            intArrayOf(31, 32),
            intArrayOf(-76, -75),
            intArrayOf(-74, -73),
            intArrayOf(34, 35),
            intArrayOf(-72, -55),
            intArrayOf(-54, -53),
            intArrayOf(37, 41),
            intArrayOf(38, 39),
            intArrayOf(-52, -51),
            intArrayOf(-50, 40),
            intArrayOf(-49, -48),
            intArrayOf(42, 45),
            intArrayOf(43, 44),
            intArrayOf(-47, -46),
            intArrayOf(-45, -44),
            intArrayOf(46, 47),
            intArrayOf(-43, -42),
            intArrayOf(-41, -40)
        )
        val F_HUFFMAN_ENV_BAL_1_5DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-65, 2),
            intArrayOf(-63, 3),
            intArrayOf(-66, 4),
            intArrayOf(-62, 5),
            intArrayOf(-61, 6),
            intArrayOf(-67, 7),
            intArrayOf(-68, 8),
            intArrayOf(-60, 9),
            intArrayOf(10, 11),
            intArrayOf(-69, -59),
            intArrayOf(-70, 12),
            intArrayOf(-58, 13),
            intArrayOf(14, 17),
            intArrayOf(-71, 15),
            intArrayOf(-57, 16),
            intArrayOf(-56, -73),
            intArrayOf(18, 32),
            intArrayOf(19, 25),
            intArrayOf(20, 22),
            intArrayOf(-72, 21),
            intArrayOf(-88, -87),
            intArrayOf(23, 24),
            intArrayOf(-86, -85),
            intArrayOf(-84, -83),
            intArrayOf(26, 29),
            intArrayOf(27, 28),
            intArrayOf(-82, -81),
            intArrayOf(-80, -79),
            intArrayOf(30, 31),
            intArrayOf(-78, -77),
            intArrayOf(-76, -75),
            intArrayOf(33, 40),
            intArrayOf(34, 37),
            intArrayOf(35, 36),
            intArrayOf(-74, -55),
            intArrayOf(-54, -53),
            intArrayOf(38, 39),
            intArrayOf(-52, -51),
            intArrayOf(-50, -49),
            intArrayOf(41, 44),
            intArrayOf(42, 43),
            intArrayOf(-48, -47),
            intArrayOf(-46, -45),
            intArrayOf(45, 46),
            intArrayOf(-44, -43),
            intArrayOf(-42, 47),
            intArrayOf(-41, -40)
        )
        val T_HUFFMAN_ENV_3_0DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-65, 2),
            intArrayOf(-63, 3),
            intArrayOf(-66, 4),
            intArrayOf(-62, 5),
            intArrayOf(-67, 6),
            intArrayOf(-61, 7),
            intArrayOf(-68, 8),
            intArrayOf(-60, 9),
            intArrayOf(10, 11),
            intArrayOf(-69, -59),
            intArrayOf(12, 14),
            intArrayOf(-70, 13),
            intArrayOf(-71, -58),
            intArrayOf(15, 18),
            intArrayOf(16, 17),
            intArrayOf(-72, -57),
            intArrayOf(-73, -74),
            intArrayOf(19, 22),
            intArrayOf(-56, 20),
            intArrayOf(-55, 21),
            intArrayOf(-54, -77),
            intArrayOf(23, 31),
            intArrayOf(24, 25),
            intArrayOf(-75, -76),
            intArrayOf(26, 27),
            intArrayOf(-78, -53),
            intArrayOf(28, 29),
            intArrayOf(-52, -95),
            intArrayOf(-94, 30),
            intArrayOf(-93, -92),
            intArrayOf(32, 47),
            intArrayOf(33, 40),
            intArrayOf(34, 37),
            intArrayOf(35, 36),
            intArrayOf(-91, -90),
            intArrayOf(-89, -88),
            intArrayOf(38, 39),
            intArrayOf(-87, -86),
            intArrayOf(-85, -84),
            intArrayOf(41, 44),
            intArrayOf(42, 43),
            intArrayOf(-83, -82),
            intArrayOf(-81, -80),
            intArrayOf(45, 46),
            intArrayOf(-79, -51),
            intArrayOf(-50, -49),
            intArrayOf(48, 55),
            intArrayOf(49, 52),
            intArrayOf(50, 51),
            intArrayOf(-48, -47),
            intArrayOf(-46, -45),
            intArrayOf(53, 54),
            intArrayOf(-44, -43),
            intArrayOf(-42, -41),
            intArrayOf(56, 59),
            intArrayOf(57, 58),
            intArrayOf(-40, -39),
            intArrayOf(-38, -37),
            intArrayOf(60, 61),
            intArrayOf(-36, -35),
            intArrayOf(-34, -33)
        )
        val F_HUFFMAN_ENV_3_0DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-65, 2),
            intArrayOf(-63, 3),
            intArrayOf(-66, 4),
            intArrayOf(-62, 5),
            intArrayOf(-67, 6),
            intArrayOf(7, 8),
            intArrayOf(-61, -68),
            intArrayOf(9, 10),
            intArrayOf(-60, -69),
            intArrayOf(11, 12),
            intArrayOf(-59, -70),
            intArrayOf(13, 14),
            intArrayOf(-58, -71),
            intArrayOf(15, 16),
            intArrayOf(-57, -72),
            intArrayOf(17, 19),
            intArrayOf(-56, 18),
            intArrayOf(-55, -73),
            intArrayOf(20, 24),
            intArrayOf(21, 22),
            intArrayOf(-74, -54),
            intArrayOf(-53, 23),
            intArrayOf(-75, -76),
            intArrayOf(25, 30),
            intArrayOf(26, 27),
            intArrayOf(-52, -51),
            intArrayOf(28, 29),
            intArrayOf(-77, -79),
            intArrayOf(-50, -49),
            intArrayOf(31, 39),
            intArrayOf(32, 35),
            intArrayOf(33, 34),
            intArrayOf(-78, -46),
            intArrayOf(-82, -88),
            intArrayOf(36, 37),
            intArrayOf(-83, -48),
            intArrayOf(-47, 38),
            intArrayOf(-86, -85),
            intArrayOf(40, 47),
            intArrayOf(41, 44),
            intArrayOf(42, 43),
            intArrayOf(-80, -44),
            intArrayOf(-43, -42),
            intArrayOf(45, 46),
            intArrayOf(-39, -87),
            intArrayOf(-84, -40),
            intArrayOf(48, 55),
            intArrayOf(49, 52),
            intArrayOf(50, 51),
            intArrayOf(-95, -94),
            intArrayOf(-93, -92),
            intArrayOf(53, 54),
            intArrayOf(-91, -90),
            intArrayOf(-89, -81),
            intArrayOf(56, 59),
            intArrayOf(57, 58),
            intArrayOf(-45, -41),
            intArrayOf(-38, -37),
            intArrayOf(60, 61),
            intArrayOf(-36, -35),
            intArrayOf(-34, -33)
        )
        val T_HUFFMAN_ENV_BAL_3_0DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-63, 2),
            intArrayOf(-65, 3),
            intArrayOf(-66, 4),
            intArrayOf(-62, 5),
            intArrayOf(-61, 6),
            intArrayOf(-67, 7),
            intArrayOf(-68, 8),
            intArrayOf(-60, 9),
            intArrayOf(10, 16),
            intArrayOf(11, 13),
            intArrayOf(-69, 12),
            intArrayOf(-76, -75),
            intArrayOf(14, 15),
            intArrayOf(-74, -73),
            intArrayOf(-72, -71),
            intArrayOf(17, 20),
            intArrayOf(18, 19),
            intArrayOf(-70, -59),
            intArrayOf(-58, -57),
            intArrayOf(21, 22),
            intArrayOf(-56, -55),
            intArrayOf(-54, 23),
            intArrayOf(-53, -52)
        )
        val F_HUFFMAN_ENV_BAL_3_0DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-65, 2),
            intArrayOf(-63, 3),
            intArrayOf(-66, 4),
            intArrayOf(-62, 5),
            intArrayOf(-61, 6),
            intArrayOf(-67, 7),
            intArrayOf(-68, 8),
            intArrayOf(-60, 9),
            intArrayOf(10, 13),
            intArrayOf(-69, 11),
            intArrayOf(-59, 12),
            intArrayOf(-58, -76),
            intArrayOf(14, 17),
            intArrayOf(15, 16),
            intArrayOf(-75, -74),
            intArrayOf(-73, -72),
            intArrayOf(18, 21),
            intArrayOf(19, 20),
            intArrayOf(-71, -70),
            intArrayOf(-57, -56),
            intArrayOf(22, 23),
            intArrayOf(-55, -54),
            intArrayOf(-53, -52)
        )
        val T_HUFFMAN_NOISE_3_0DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-63, 2),
            intArrayOf(-65, 3),
            intArrayOf(-66, 4),
            intArrayOf(-62, 5),
            intArrayOf(-67, 6),
            intArrayOf(7, 8),
            intArrayOf(-61, -68),
            intArrayOf(9, 30),
            intArrayOf(10, 15),
            intArrayOf(-60, 11),
            intArrayOf(-69, 12),
            intArrayOf(13, 14),
            intArrayOf(-59, -53),
            intArrayOf(-95, -94),
            intArrayOf(16, 23),
            intArrayOf(17, 20),
            intArrayOf(18, 19),
            intArrayOf(-93, -92),
            intArrayOf(-91, -90),
            intArrayOf(21, 22),
            intArrayOf(-89, -88),
            intArrayOf(-87, -86),
            intArrayOf(24, 27),
            intArrayOf(25, 26),
            intArrayOf(-85, -84),
            intArrayOf(-83, -82),
            intArrayOf(28, 29),
            intArrayOf(-81, -80),
            intArrayOf(-79, -78),
            intArrayOf(31, 46),
            intArrayOf(32, 39),
            intArrayOf(33, 36),
            intArrayOf(34, 35),
            intArrayOf(-77, -76),
            intArrayOf(-75, -74),
            intArrayOf(37, 38),
            intArrayOf(-73, -72),
            intArrayOf(-71, -70),
            intArrayOf(40, 43),
            intArrayOf(41, 42),
            intArrayOf(-58, -57),
            intArrayOf(-56, -55),
            intArrayOf(44, 45),
            intArrayOf(-54, -52),
            intArrayOf(-51, -50),
            intArrayOf(47, 54),
            intArrayOf(48, 51),
            intArrayOf(49, 50),
            intArrayOf(-49, -48),
            intArrayOf(-47, -46),
            intArrayOf(52, 53),
            intArrayOf(-45, -44),
            intArrayOf(-43, -42),
            intArrayOf(55, 58),
            intArrayOf(56, 57),
            intArrayOf(-41, -40),
            intArrayOf(-39, -38),
            intArrayOf(59, 60),
            intArrayOf(-37, -36),
            intArrayOf(-35, 61),
            intArrayOf(-34, -33)
        )
        val T_HUFFMAN_NOISE_BAL_3_0DB = arrayOf(
            intArrayOf(-64, 1),
            intArrayOf(-65, 2),
            intArrayOf(-63, 3),
            intArrayOf(4, 9),
            intArrayOf(-66, 5),
            intArrayOf(-62, 6),
            intArrayOf(7, 8),
            intArrayOf(-76, -75),
            intArrayOf(-74, -73),
            intArrayOf(10, 17),
            intArrayOf(11, 14),
            intArrayOf(12, 13),
            intArrayOf(-72, -71),
            intArrayOf(-70, -69),
            intArrayOf(15, 16),
            intArrayOf(-68, -67),
            intArrayOf(-61, -60),
            intArrayOf(18, 21),
            intArrayOf(19, 20),
            intArrayOf(-59, -58),
            intArrayOf(-57, -56),
            intArrayOf(22, 23),
            intArrayOf(-55, -54),
            intArrayOf(-53, -52)
        )
    }
}