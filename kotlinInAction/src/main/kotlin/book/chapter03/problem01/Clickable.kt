package book.chapter03.problem01

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")   // java default interface 와 같음
}