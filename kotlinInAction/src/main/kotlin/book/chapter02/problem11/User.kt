package book.chapter02.problem11

class User (val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(user: User,
                 value: String,
                fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun saveUser2(user: User) {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: " +
                    "empty $fieldName"
            )
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun main() {
    val user = User(1, "123", "123412312")

    saveUser(user)
    saveUser2(user)
}