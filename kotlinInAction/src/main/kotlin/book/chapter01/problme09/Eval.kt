package book.chapter01.problme09

fun eval(e: Expr) : Int {
    if(e is Num) {
        val n = e as Num
        return n.value
    }

    if(e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}
