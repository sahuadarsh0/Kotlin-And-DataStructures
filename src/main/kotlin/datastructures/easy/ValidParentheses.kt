package datastructures.easy



fun main() {
    val solution = ValidParentheses()
    val ans1 = solution.isValid( "()")
    val ans2 = solution.isValid("()[]{}")
    val ans3 = solution.isValid("(]")
    val ans4 = solution.isValid("{[]}")
    print("\nans1-> $ans1 ")
    print("\nans2-> $ans2 ")
    print("\nans3-> $ans3 ")
    print("\nans4-> $ans4 ")
}

class ValidParentheses {
    fun isValid(sOld: String): Boolean {

        var length: Int
        var s = sOld

        do {
            length = s.length
            s = s.replace("()", "").replace("{}", "").replace("[]", "")
        } while (length != s.length)

        return s.isEmpty()

    }
}