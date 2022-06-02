package lesson_3

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Eating")
    }

    open fun run() {
        println("Running")
    }
}

abstract class Worker(val name: String, val age: Int) {
    abstract fun work()
}