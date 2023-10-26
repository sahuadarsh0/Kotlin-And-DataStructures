package datastructures.easy

fun main() {
    val palindromeNumber = PalindromeNumber()
    val ans1 = palindromeNumber.isPalindrome(121)
    val ans2 = palindromeNumber.isPalindrome(111)
    val ans3 = palindromeNumber.isPalindrome(1234321)
    println("ans1-> $ans1")
    println("ans2-> $ans2")
    println("ans3-> $ans3")
}

class PalindromeNumber {
    fun isPalindrome(num: Int): Boolean {
        if (num < 0) return false
        var temp = num
        var sum = 0
        while (temp != 0) {
            sum *= 10
            sum += temp % 10
            temp /= 10
        }
        return sum == num

    }
}
