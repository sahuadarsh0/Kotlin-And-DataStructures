package datastructures.easy

fun main() {

    val arr = readLine()!!.toString().split(" ")
    val solution = arr[0].toInt() * arr[2].toInt() + arr[1].toInt() * arr[3].toInt()
    println(solution)

//    val solution = BuyPlease()
//    solution.buyPlease("1 1 4 8")
//    solution.buyPlease("2 4 4 5")

}

//class BuyPlease {
//    fun buyPlease(nums: String) {
//        val arr = nums.split(" ")
//        val solution = arr[0].toInt() * arr[2].toInt() + arr[1].toInt() * arr[3].toInt()
//        println(solution)
//    }
//}
