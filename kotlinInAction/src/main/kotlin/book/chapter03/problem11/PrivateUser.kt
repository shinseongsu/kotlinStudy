package book.chapter03.problem11

class PrivateUser (override val nickname: String) : User

class SubscringUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}
