package datastructures.easy

fun main() {
    val solution = Solution()
    val ans1 = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
    val ans2 = solution.twoSum(intArrayOf(3, 2, 4), 6)
    val ans3 = solution.twoSum(intArrayOf(3, 3), 6)
    print("ans1-> ")
    ans1.forEach { print("$it") }
    print("\nans2-> ")
    ans2.forEach { print("$it") }
    print("\nans3-> ")
    ans3.forEach { print("$it") }
}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        lateinit var ans: IntArray
        for ((indices, value) in nums.withIndex()) {
            for (i in nums)
                 if ((value + i) == target) {
                     ans = intArrayOf(nums.indexOf(i),indices)
                }
        }

        return ans
    }
}
