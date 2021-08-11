package datastructures.easy

fun main() {

//    asp(9)
//    asp(6)
    asp(6)
    asp2(4)
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
fun asp2(num: Int) {
    val k = num*5
    var line=0
    for (i in 1..k) {
        if (line%2==0){
        print("${i}  ")}
        else{
            print("${line*10+6-i}  ")
        }
        if (i % 5 == 0) {
            println()
            line++
        }

    }
}