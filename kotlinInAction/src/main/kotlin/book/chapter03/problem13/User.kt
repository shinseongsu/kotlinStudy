package book.chapter03.problem13

class User(val name: String) {
    var address : String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main() {
    val user = User("Alice")
    user.address = "Elsenheimerstrase 47, 80687 Muenchen"
}