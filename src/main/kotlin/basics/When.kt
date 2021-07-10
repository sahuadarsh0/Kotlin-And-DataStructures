package basics

fun main() {
//    val day = readLine()!!
    val day = "Monday"
    when (day) {
        "Monday" -> {
            println("Today is Money Day")
        }
        "Tuesday" -> {
            println("Today is Playing Day")
        }
        "Sunday" -> {
            println("Today is Sleeping Day")
        }
        else -> {
            println("Working Day")
        }
    }
}