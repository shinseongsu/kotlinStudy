package book.chapter02.problem10

import book.chapter02.problem09.parsePath

fun parsePath2(path: String) {
    val regex = """(.+)/(.+)\,(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)

    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main() {
    parsePath2("/Users/yole/kotlin-book/chapter.adoc")
}