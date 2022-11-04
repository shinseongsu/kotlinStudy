package chapter03

fun main() {

    // if..else 사용
    val job = "Software Developer"

    if(job == "SoftWare Developer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }

    // 코틀린의 if..else는 표현식이다
    val age : Int = 10

    val str = if (age > 10) {
        "상인"
    } else  {
        "아이"
    }
    println(str)

    // 코틀린은 삼항연산자가 없다. if..else 가 표현식으므로 불필요핟다.
    val a = 1
    val b = 2
    val c = if (b > a) b else a
}