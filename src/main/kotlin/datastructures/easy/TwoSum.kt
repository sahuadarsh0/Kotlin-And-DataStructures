package datastructures.easy

fun main() {
    val solution = TwoSum()
    val ans1 = solution.twoSum(intArrayOf(2, 7, 11, 15), 9)
    val ans2 = solution.twoSum(intArrayOf(2,5,5,11), 10)
    val ans3 = solution.twoSum(intArrayOf(3, 3), 6)
    print("ans1-> ")
    ans1.forEach { print("$it") }
    print("\nans2-> ")
    ans2.forEach { print("$it") }
    print("\nans3-> ")
    ans3.forEach { print("$it") }
}

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i+1 until nums.size) {
                if ((nums[i] + nums[j]) == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}
