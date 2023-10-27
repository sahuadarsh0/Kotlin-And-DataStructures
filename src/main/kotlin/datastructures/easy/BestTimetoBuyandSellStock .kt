package datastructures.easy

fun main() {
    val solution = BestTimetoBuyandSellStock()
    val ans1 = solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    val ans2 = solution.maxProfit(intArrayOf(7, 6, 4, 3, 1))
    val ans3 = solution.maxProfit(intArrayOf(2, 4, 1))
    print("\nans1-> $ans1 ")
    print("\nans2-> $ans2 ")
    print("\nans3-> $ans3 ")
}

class BestTimetoBuyandSellStock {
    fun maxProfit(prices: IntArray): Int {

        var lowPrice = prices.first()
        var maxPrice = 0
        var maxProfit = 0
        var j = 0
        for ((i, v) in prices.withIndex()) {

            println("loop $i")
            if (lowPrice > v) {
                lowPrice = v
                j = i
                println("low Price $lowPrice")
                println("low position $j")
                maxPrice = 0
            }
            if (maxPrice < v)
                if (i == 0)
                    continue
                else if (i > j) {
                    maxPrice = v
                    println("max Price $maxPrice")
                }

            if (maxPrice == 0)
                maxPrice = lowPrice
            if (maxProfit < maxPrice - lowPrice)
                maxProfit = maxPrice - lowPrice
        }
        println()
        println()
        println()
        println()
        return maxProfit


    }

}