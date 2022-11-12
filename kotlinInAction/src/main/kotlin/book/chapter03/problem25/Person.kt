package book.chapter03.problem25

class Person(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String): Person = Person("test")
    }
}

fun main() {
    val person = Person.Loader.fromJSON("{name: 'Dmitry'}")
    println(person.name)

    val person2 = Person.fromJSON("{name: 'Dmitry'}")
    println(person2.name)
}
