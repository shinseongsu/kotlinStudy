package book.chapter03.problem02

import book.chapter03.problem01.Clickable

class Button : Clickable, Focusable  {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.showOff()        // I'm clickable!
                            // I'm focusable!
    button.setFocus(true)   // I got focus.
    button.click()          // I was clicked
}