package datastructures.easy

fun main() {
    val solution = RemoveDuplicatesFromSortedArray()
    val ans1 = solution.removeDuplicates(intArrayOf(1, 7, 7, 7, 7, 7, 7, 7, 7, 15))
    val ans2 = solution.removeDuplicates(intArrayOf(1, 2, 4))
    val ans3 = solution.removeDuplicates(intArrayOf(1, 2, 3, 3, 4))
    print("ans1-> $ans1 ")
    print("ans2-> $ans2 ")
    print("ans3-> $ans3 ")
}

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var temp = nums[0]
        var k = 1
        for (i in 1 until nums.size) {
            if (temp == nums[i]) {
                nums[i] = 101
            } else {
                k++
                temp = nums[i]
            }
        }
        nums.sort()
        nums.forEach { print(" $it ") }
        return k
    }
}
