package oops

/*
Kotlin Scope Functions
+----------+----------------+----------------+
| Function | Context Object |  Return Value  |
+----------+----------------+----------------+
| let      | it             | lambda result  |
| run      | this           | lambda result  |
| with     | this           | lambda result  |
| apply    | this           | context object |
| also     | it             | context object |
+----------+----------------+----------------+
*/

/*
*
* There are mainly 2 differences between with and apply:
*
* apply accepts an instance as the receiver while with requires an instance to be passed as an argument.
* In both cases, the instance will become 'this' within a block.
* apply returns the receiver and with returns a result of the last expression within its block.
* Usually, you use apply when you need to do something with an object and return it.
* And when you need to perform some operations on an object and return some other object you can use with.
*
* Let is used to access the property of the object
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

//    let
    val person = Student().let {
        return@let "The name of the Person is: ${it.name}"
    }
    print(person)
}

data class Student(var name: String = "", var age: Int = 18) {
    fun displayInfo() = print("\n Name: $name\n Age : $age\n ")
}