package oops


/*
*
* There are mainly two differences between with and apply:
*
* apply accepts an instance as the receiver while with requires an instance to be passed as an argument.
* In both cases, the instance will become 'this' within a block.
* apply returns the receiver and with returns a result of the last expression within its block.
* Usually, you use apply when you need to do something with an object and return it.
* And when you need to perform some operations on an object and return some other object you can use with.
*
* */
fun main() {

//    apply
    val student = Student()
    val x = student.apply { // returns same object
        name = "Adarsh"
        age = 15
    }
    println(x)


}

data class Student(var name: String = "", var age: Int = 18)