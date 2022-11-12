package book.chapter03.problem12

interface User {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}