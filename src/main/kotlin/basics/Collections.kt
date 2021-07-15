package basics

/* *
+------+--------------+---------------------+
|      |  Immutable   |       Mutable       |
+------+--------------+---------------------+
| List | listOf<T>()  | mutableListOf<T>()  |
| Set  | setOf<T>()   | mutableSetOf<T>()  |
| Map  | mapOf<K,V>() | mutableMapOf<K,V>() |
+------+--------------+---------------------+
* */

fun main() {
    val student1 = mutableMapOf<Int, String>(1 to "Adarsh", 2 to "Rohit", 3 to "Krishna")
    student1.remove(1)
    student1[7] = "new value"
    student1.forEach { (t, u) ->
        println("$t and $u")
    }
    val student2 = mutableSetOf<String>( "Adarsh", "Adarsh", "Rohit", "Krishna") // non repeatable Adarsh
    student2.remove("Adarsh")
    student2.add("Rohit")
    student2.forEach {  t ->
        println(t) // Adarsh Rohit Krishna
    }
    val student3 = mutableListOf<String>( "Adarsh", "Adarsh", "Rohit", "Krishna") //  repeatable Adarsh
    student3.remove("Adarsh")
    student3.add("Rohit")
    student3.forEach {  t ->
        println(t) // Adarsh Adarsh Rohit Krishna Rohit
    }
}