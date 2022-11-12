package book.chapter03.problem23

class User {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = facebookAccountId.toString()
    }

}
