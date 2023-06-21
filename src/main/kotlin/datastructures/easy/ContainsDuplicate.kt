package datastructures.easy

fun main() {
    val solution = ContainsDuplicate()
    val ans1 = solution.containsDuplicate(intArrayOf(1, 2, 3, 1))
    val ans2 = solution.containsDuplicate(intArrayOf(1, 2, 3, 4))
    val ans3 = solution.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))
    print("\nans1-> $ans1 ")
    print("\nans2-> $ans2 ")
    print("\nans3-> $ans3 ")
}

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {

        for (i in nums.indices) {
            val element = nums[i]
            for (j in i + 1 until nums.size) {
                if (nums[j] == element) {
                    return true
                }
            }
        }
        return false

    }

}