package basics

fun main() {

    val fish = 2
    println(fish.times(5))
    println(fish.plus(5))
    println(fish.minus(5))
    println(fish.div(2))
//    use primitive 'int' as an object
    1.toLong()
//    boxing
    val box: Number = 5
    println(box.toLong())

}