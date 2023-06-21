package datastructures.easy

fun main() {
    val solution = ClimbingStairs()
    val ans1 = solution.climbStairs(4)
    val ans2 = solution.climbStairs(5)
    val ans3 = solution.climbStairs(6)
    print("\nans1-> $ans1 ")
    print("\nans2-> $ans2 ")
    print("\nans3-> $ans3 ")
}

class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        var ans = 0
        var nm1 = 1
        var nm2 = 2
        if (n == 1 || n == 2)
            return n
        for (i in 3..n) {
            ans = nm1 + nm2
            nm1 = nm2
            nm2 = ans
        }
        return ans
    }
}