package basics

//val num = intArrayOf(1, 2, 3, 4)
//Other factory methods available for creating arrays:
//
//byteArrayOf()
//charArrayOf()
//shortArrayOf()
//longArrayOf()


fun main() {

    val a: Array<Int> = arrayOf(2, 3, 4, 5)
    val b: IntArray = intArrayOf(2, 3, 4, 5)
    val c: Array<Any> = arrayOf(2, 3, 4, "5")

    val x = Array(5) { 4 }

    println(a[2])
    println(x[3])
    println(x[2])

}