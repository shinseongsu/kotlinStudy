package book.chapter03.problem06

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}
