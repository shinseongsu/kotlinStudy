package book.chapter02.problem03

// fun String.lastChar(): Char = this.get(this.length - 1)

// this 생략 가능
fun String.lastChar(): Char = this.get(length - 1)

fun main() {
    println("Kotlin".lastChar())
}
