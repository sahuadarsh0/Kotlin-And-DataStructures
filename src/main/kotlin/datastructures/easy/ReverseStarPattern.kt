package datastructures.easy

fun main() {

    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        for (j in 0..i)
            print("*")
        println()
    }

    /*
    val solution = ReverseStarPattern()
     solution.reverseStarPattern(4)
     solution.reverseStarPattern(2)
     */

}
/*
class ReverseStarPattern {
    fun reverseStarPattern(num: Int) {
        for (i in 0 until  num) {
            for (j in 0..i)
                print("*")
            println()
        }
    }
}
*/
