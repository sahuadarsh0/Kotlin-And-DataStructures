package datastructures.easy

fun main() {
    val solution = IntersectionOfTwoArrays()
    val ans1 = solution.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
    val ans2 = solution.intersection(intArrayOf(9, 4, 9, 8, 4), intArrayOf(4, 9, 5))
//    val ans2 = solution.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))
    val ans3 = solution.intersection(intArrayOf(3, 3), intArrayOf(3))
    print("ans1-> ")
    ans1.forEach { print(" $it ") }
    print("\nans2-> ")
    ans2.forEach { print(" $it ") }
    print("\nans3-> ")
    ans3.forEach { print(" $it ") }
}

class IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

        val ans = mutableListOf<Int>()
        var i = 0
        var j = 0
        nums2.sort()
        nums1.sort()
        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] < nums2[j]) {
                i++
            } else if (nums1[i] > nums2[j]) {
                j++
            } else if (nums1[i] == nums2[j]) {
                if(!ans.contains(nums1[i]))
                ans.add(nums1[i])
                i++
                j++
            }
        }
        return ans.toIntArray()
    }
}
