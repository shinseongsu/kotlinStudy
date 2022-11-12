package book.chapter03.problem24

// 동반 객체
class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) =
            User(accountId.toString())
    }
}

fun main() {
    val subscriingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)

    println(subscriingUser.nickname)
}
