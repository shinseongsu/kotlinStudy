package book.chapter03.problem27

class Person(val firstName: String, val lastName: String) {
    companion object {

    }
}

fun Person.Companion.fromJSON(json: String): Person {
    return Person("test", "example")
}

fun main() {
    val p = Person.fromJSON("test")
    println("${p.firstName} : ${p.lastName} ")
}