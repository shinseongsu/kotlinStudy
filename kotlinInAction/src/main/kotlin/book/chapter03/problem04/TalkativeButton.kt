package book.chapter03.problem04

import book.chapter03.problem02.Focusable

class TalkativeButton : Focusable {
    fun yell() = println("Hey!")
    fun whisper() = println("Let's talk!")
}

fun TalkativeButton.givenSpeech() {
    yell()
    whisper()
}
