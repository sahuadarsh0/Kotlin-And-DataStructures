package basics

object Manager {
    init {
        println("Manager Object Initialized")
    }
}

//Singleton the old way
class Singleton private constructor() {
    companion object {
        private var instance: Singleton? = null
        operator fun invoke(): Singleton = synchronized(this) {
            if (instance == null)
                instance = Singleton()
            return instance!!
        }
    }
}

fun main() {
    println(Manager)
    println(Manager)
    println(Singleton)
}