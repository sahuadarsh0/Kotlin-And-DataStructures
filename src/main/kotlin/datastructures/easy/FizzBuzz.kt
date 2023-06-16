package datastructures.easy

fun main() {
    val solution = FizzBuzz()
    val ans1 = solution.fizzBuzz(20)
    val ans2 = solution.fizzBuzz(5)
    val ans3 = solution.fizzBuzz(2)
    print("ans1-> ")
    ans1.forEach { print(it) }
    print("\nans2-> ")
    ans2.forEach { print(it) }
    print("\nans3-> ")
    ans3.forEach { print(it) }
}
class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {

        val answer = ArrayList<String>(n)
        for(i in 1..n){

            if(i % 3 == 0 && i % 5 == 0)
                answer.add("FizzBuzz")

            else if(i % 3 == 0)
                answer.add("Fizz")

            else if( i % 5 == 0)
                answer.add("Buzz")
            else
                answer.add("$i")

        }
        return answer
    }
}