package book.chapter02.problem05

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main() {
    val view: View = Button()

    view.click()    // Button clicked
    view.showOff()  // I'm a view   -> 확장함수는 정적으로 결정된다.
}