package datastructures.easy

fun main() {
    val solution = SortedSquares()
    val ans1 = solution.sortedSquares(intArrayOf(-4,-1,0,3,10))//0  1  9  16  100
//    val ans2 = solution.intersection(intArrayOf(9, 4, 9, 8, 4), intArrayOf(4, 9, 5))
////    val ans2 = solution.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))
//    val ans3 = solution.intersection(intArrayOf(3, 3), intArrayOf(3))
    print("ans1-> ")
    ans1.forEach { print(" $it ") }
//    print("\nans2-> ")
//    ans2.forEach { print(" $it ") }
//    print("\nans3-> ")
//    ans3.forEach { print(" $it ") }
}

class SortedSquares {
    fun sortedSquares(nums: IntArray): IntArray {
        val ans = mutableListOf<Int>()
        for (i in nums.indices) {
            ans.add(nums[i]*nums[i])
        }
        ans.sort()
        return ans.toIntArray()
    }
}
