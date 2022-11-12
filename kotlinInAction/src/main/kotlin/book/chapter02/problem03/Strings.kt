package book.chapter02.problem03

var opCount = 0
// val UNIX_LINE_SEPARATOR = "\n"  // val 은 get가 생기기 떄문에 상수로 자연스럽지 못한다.
const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}