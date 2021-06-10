package datastructures.easy

fun main() {
    val solution = AddDigits()
    val ans1 = solution.addDigits(38)
    val ans2 = solution.addDigits(199)
    val ans3 = solution.addDigits(0)
    println("ans1-> $ans1")
    println("ans2-> $ans2")
    println("ans3-> $ans3")
}

class AddDigits {
    fun addDigits(num: Int): Int {
        var number = num
        fun remainder(rem: Int) = rem % 10

        while (number > 9) {
            var result = 0
            while (number > 0) {
                result += remainder(number)
                number /= 10
            }
            number = result
        }
        return number
    }
}
