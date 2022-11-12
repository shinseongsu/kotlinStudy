package book.chapter03.problem16

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name &&
            postalCode == other.postalCode
    }

    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main() {
    val client1 = Client("오현석", 4122)
    val client2 = Client("오현석", 4122)

    println(client1 == client2)

    val processed = hashSetOf(Client("오현석", 4122))

    println(processed.contains(Client("오현석", 4122)))
}