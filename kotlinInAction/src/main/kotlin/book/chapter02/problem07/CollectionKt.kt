package book.chapter02.problem07

val strings: List<String> = listOf("first", "second", "fourteenth")

fun main() {
    println(strings.last())

    val numbers: Collection<Int> = setOf(1, 14, 2)
    println(numbers.max())
}
