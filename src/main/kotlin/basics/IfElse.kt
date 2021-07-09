package basics

fun main() {
//    val num = readLine()!!.toInt()
    val num = 10
    val result = if (num % 2 == 0) "even" else "odd"
    println(result)

    val temperature = 10
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
    println(message)

}