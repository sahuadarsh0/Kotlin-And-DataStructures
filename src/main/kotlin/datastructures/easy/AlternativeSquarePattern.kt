package datastructures.easy

fun main() {

    asp(9)
    asp(6)
    asp(4)
}

fun asp(num: Int) {
    var k = 0
    for (i in 1..num) {
        if (i % 2 != 0) {
            for (j in 1..5) {
                print("${++k} ")
            }
        } else {
            for (j in 5 downTo 1) {
                print("${k + j} ")
            }
            k += 5
        }
        println()
    }
    println()
}