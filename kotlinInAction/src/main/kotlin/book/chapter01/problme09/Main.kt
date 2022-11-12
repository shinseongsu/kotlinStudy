package book.chapter01.problme09

fun main() {
    println( eval(Sum(Sum(Num(1), Num(2)), Num(4))) )

    println(eval2( Sum(Num(1), Num(2)) ))

    println(eval3(Sum(Num(1), Num(2) )))
}
