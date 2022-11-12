package book.chapter03.problem01

class Button: Clickable {
    override fun click() = println("I was clicked")
}

fun main() {
    Button().click()
    Button().showOff()
}