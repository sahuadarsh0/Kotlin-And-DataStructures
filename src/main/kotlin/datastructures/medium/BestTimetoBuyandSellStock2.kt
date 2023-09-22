package datastructures.medium

fun main() {
    val solution = BestTimetoBuyandSellStock2()
    val ans1 = solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    val ans2 = solution.maxProfit(intArrayOf(7, 6, 4, 3, 1))
    val ans3 = solution.maxProfit(intArrayOf(2, 4, 1))
    print("\nans1-> $ans1 ")
    print("\nans2-> $ans2 ")
    print("\nans3-> $ans3 ")
}

class BestTimetoBuyandSellStock2 {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (i in 1 until prices.size) {

            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1]

            println("max maxProfit $maxProfit")
            println()
        }
        println("maxProfit $maxProfit")
        println()
        return maxProfit


    }

}