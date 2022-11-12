package book.chapter01.problme11

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzZBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}