package book.chapter03.problem17

class Client(val name: String, val postalCode: Int) {

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) =
        Client(name, postalCode)
}

fun main() {
    val lee = Client("이계영", 4122)

    println(lee.copy(postalCode = 4000))
}