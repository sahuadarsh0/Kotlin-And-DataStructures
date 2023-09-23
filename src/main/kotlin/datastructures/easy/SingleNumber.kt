package datastructures.easy

fun main() {
    val solution = SingleNumber()
    val ans1 = solution.singleNumber(intArrayOf(2, 2, 1))
    val ans2 = solution.singleNumber(intArrayOf(4, 1, 2, 1, 2))
    val ans3 = solution.singleNumber(intArrayOf(1))
    print("\nans1-> $ans1 ")
    print("\nans2-> $ans2 ")
    print("\nans3-> $ans3 ")
}

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {

        val ans = hashMapOf<Int, Int>()
        for (i in nums) {
            if (ans.containsKey(i)) {
                ans[i] = ans[i]?.plus(1) ?: 1
            } else {
                ans[i] = 1
            }
        }
        for ((num, count) in ans) {
            if (count == 1) {
                return num
            }
        }
        return 0


    }
}