package book.chapter01.problme06

import book.chapter01.problme05.Color
import book.chapter01.problme05.Color.*;

fun getWarmth2(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}