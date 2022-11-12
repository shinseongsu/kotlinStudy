package book.chapter01.problme09

fun eval3(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            eval3(e.right) + eval3(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }