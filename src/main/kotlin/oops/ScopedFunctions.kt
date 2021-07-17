package oops

/*
Refer to https://blog.mindorks.com/using-scoped-functions-in-kotlin-let-run-with-also-apply

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

//    apply ->    similar to run
//          ->

    val person: Student? = null
    person?.apply {
        name = "asdf"
        displayInfo()
    }
    val student = Student()
    val x = student.apply { // returns same object
        name = "Adarsh"
        age = 15
    }
    println(x)






//    let ->    last line is the return statement
//        ->    helpful in null-safety calls

    val person1 = Student().let { student1 ->
        return@let "The name of the Person is: ${student1.name}"
    }
    val person2 = Student().let {
        "The name of the Person is: ${it.name}"
    }
    val person3 = Student().let {
        it.name = "NewName"
        2
    }
    val name1 = Student().name?.let {
        "The name of the Person is: $it"
    }
    print(person1)
    print(person2)
    print(person3) //kotlin.Unit
    print(name1)









//    Run ->    similar to let
//        ->    'this' cannot be renamed

    val name2 = Student().name?.run {
        "The name of the Person is: $this"
    }
    print(name2)










//    With ->    similar to run
//        ->

    val person5 = with(Student()) {
        return@with "The name of the Person is: ${this.name}"
    }
    print(person5)

    val person6: Student? = null
    with(person6) {
        this?.name = "asdf"
        this?.displayInfo()
    }







//    Also ->    similar to run
//        ->

    val name = Student().also { currentPerson ->
        print("Current name is: ${currentPerson.name}\n")
        currentPerson.name = "modifiedName"
    }.run {
        "Modified name is: $name\n"
    }
    print(name)

}

data class Student(var name: String = "", var age: Int = 18) {
    fun displayInfo() = print("\n Name: $name\n Age : $age\n ")
}