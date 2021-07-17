package basics

fun main() {

//    val sum: (Int) -> Int = { it * it }

//    Return Function
    val addition = doAdd()
    println(addition(5, 5))

//    Takes Function
    printMyName { println(it) }
    val fn: (num1: Int, num2: Int) -> Int = ::addNumbers
    println(fn(12, 2))
    calculator(15, 15, ::addNumbersDouble)


    val pow: (Int) -> Int = { x -> x * x }
    val ans = pow(5)
    println(ans)

    val pow2: (Int) -> Int = { it * it } // for single parameter
    val ans2 = pow2(5)
    println(ans2)

    val sayHi = { msg: String -> println(" Hi $msg") }
    sayHi("Adarsh")

    calculator(15, 15, ::addNumbersDouble)
    calculator(15, 15, {a,b -> (a+b).toDouble()})
    calculator(15, 15) { a, b -> (a + b).toDouble() }
    calculator(15, 15) { a, b -> (a * b).toDouble() }
    calculator(15, 15) { a, b -> (a - b).toDouble() }

}


fun doAdd(): (Int, Int) -> Int {
    return ::addNumbers
}

fun doAddDouble(): (Int, Int) -> Double {
    return ::addNumbersDouble
}

fun addNumbers(num1: Int, num2: Int) = num1.plus(num2)


fun addNumbersDouble(num1: Int, num2: Int): Double = num1.plus(num2).toDouble()


fun printMyName(printMe: (name: String) -> Unit) {
    printMe("Hi me")
}

fun calculator(n1: Int, n2: Int, gn: (Int, Int) -> Double) {
    val res = gn(n1, n2)
    println(res)

}