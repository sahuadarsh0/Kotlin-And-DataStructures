package datastructures.easy

fun main() {
    val solution = Solution()
    val ans1 = solution.twoSum(intArrayOf(2,7,11,15), 9)
    val ans2 = solution.twoSum(intArrayOf(3,2,4), 6)
    val ans3 = solution.twoSum(intArrayOf(3,3), 6)
    ans1.forEach { println("ans1 $it") }
    ans2.forEach { println("ans2 $it") }
    ans3.forEach { println("ans3 $it") }
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        lateinit var ans: IntArray

        return ans
    }
}
