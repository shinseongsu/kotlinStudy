package book.chapter02.problem01

fun main() {
    val set = hashSetOf(1, 7, 53)

    val list = arrayListOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val strings = listOf("first", "seconds", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())

    val list2 = listOf(1, 2, 3)
    println(list2)
}