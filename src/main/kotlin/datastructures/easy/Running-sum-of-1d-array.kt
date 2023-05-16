package datastructures.easy

fun main() {
    val solution = RunningSum()
    val ans1 = solution.runningSum(intArrayOf(2, 7, 11, 15))
    val ans2 = solution.runningSum(intArrayOf(3, 2, 4))
    val ans3 = solution.runningSum(intArrayOf(1,1,1,1,1))
    print("ans1-> ")
    ans1.forEach { print("$it") }
    print("\nans2-> ")
    ans2.forEach { print("$it") }
    print("\nans3-> ")
    ans3.forEach { print("$it") }
}

class RunningSum {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }
        return nums
    }
}
