package datastructures.medium

fun main() {
    val solution = RotateArray()
    val ans1 = solution.rotate(intArrayOf(1, 2, 3, 4, 5, 6), 2)
    val ans2 = solution.rotate(intArrayOf(-1, -100, 3, 99), 2)
    val ans3 = solution.rotate(intArrayOf(3, 3, 4, 6, 3, 6, 2, 1), 4)
    print("ans1-> ")
    ans1.forEach { print(" $it ") }
    print("\nans2-> ")
    ans2.forEach { print(" $it ") }
    print("\nans3-> ")
    ans3.forEach { print(" $it ") }
}

class RotateArray {
    fun rotate(nums: IntArray, k: Int): IntArray {
        val ans = mutableListOf<Int>()

        //  for rotation greater than array size
        val rotations = k % nums.size

        // Add the rotated elements to the answer list
        for (i in nums.size - rotations until nums.size) {
            ans.add(nums[i])
        }
        for (i in 0 until nums.size - rotations) {
            ans.add(nums[i])
        }

        // Update the nums array with the rotated elements
        for (i in ans.indices) {
            nums[i] = ans[i]
        }

        return nums
    }

}
