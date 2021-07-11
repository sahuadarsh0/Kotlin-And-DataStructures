package basics

fun main() {
//    val day = readLine()!!
    val day = "Monday"

    when (day) {
        "Monday" -> {
            println("Today is Money Day")
        }
        "Tuesday" -> {
            println("Today is Playing Day")
        }
        "Sunday" -> {
            println("Today is Sleeping Day")
        }
        else -> {
            println("Working Day")
        }
    }

    when (day) {
        "Monday", "Sunday" -> println("day == Monday or day == Sunday")
        else -> print("otherwise")
    }

    val x = 12+5+1
    val y = 75+1
    val validNumbers = 12..20
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid $validNumbers")
        !in 10..20 -> println("x is outside the range")
        else -> print("none of the above")
    }
    when {
        x.isOdd() -> print("x is odd") // Extension function
        y.isEven() -> print("y is even")
        else -> print("x+y is odd")
    }
}

private fun Int.isEven(): Boolean = this % 2 == 0 // Extension function

private fun Int.isOdd(): Boolean = this % 2 != 0 // Extension function

