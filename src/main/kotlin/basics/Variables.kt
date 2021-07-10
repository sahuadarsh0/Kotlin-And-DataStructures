package basics

var firstName2: String? = null
fun main() {

    val firstName1 = "Adarsh"
    val lastname1 = "Sahu"
    val age = 23
    println("Hi $firstName1 $lastname1, you are $age years old")

    val lastname2 = "Sahu"

    firstName2 = " Adarsh "
    println("Hello ${firstName2?.length} $lastname2")

}