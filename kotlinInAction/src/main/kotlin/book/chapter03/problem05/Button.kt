package book.chapter03.problem05

class Button : View {

    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        /* ... */
    }

    class ButtonState: State { /* ... */  }

}