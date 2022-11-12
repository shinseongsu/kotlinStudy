package book.chapter03.problem15

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode"
}

fun main() {
    val client1 = Client("오현석", 4122)
    println(client1)
}