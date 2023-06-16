package datastructures.easy

fun main() {
    val solution = RichestCustomerWealth()
    val ans1 = solution.maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)))
    val ans2 = solution.maximumWealth(arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5)))
    val ans3 = solution.maximumWealth(arrayOf(intArrayOf(2,8,7), intArrayOf(7,1,3), intArrayOf(1,9,5)))
    print("\nans1-> $ans1 ")
    print("\nans2-> $ans2 ")
    print("\nans3-> $ans3 ")
}
class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = 0
        for (customer in accounts) {
            var sum = 0
            for (bank in customer) {
                sum += bank
            }
            if (sum > max)
                max = sum
        }
        return max
    }

}