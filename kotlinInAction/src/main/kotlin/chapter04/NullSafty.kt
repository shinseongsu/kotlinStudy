package chapter04

fun main() {

    // val a : String = null   컴파일 에러
    // val b : String = "abbcc"
    // b = null                컴파일 에러

    var a : String? = null
    println(a?.length)

    val b: Int = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산자
    val c = a?.length ?: 0
    println(c)

}