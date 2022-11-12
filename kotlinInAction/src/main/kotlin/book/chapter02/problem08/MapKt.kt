package book.chapter02.problem08

val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main() {
    println(map.get(1))

    // 구조 분해 선언
    val (number, name) = 1 to "one"
}