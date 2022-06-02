package lesson_3

class Dog(weight: Float): Animal("Dog", weight, "Land") {
    override fun eat() {
        println("I eat a bone")
    }
}

class Programmer(name: String, age: Int, val language: String): Worker(name, age) {
    override fun work() {
        println("Write code in $language")
    }
}

class Seller(name: String, age: Int): Worker(name, age), Cleaner {
    override fun work() {
        println("I sell things")
    }

    override fun clean() {
        println("I cleaning")
    }
}

class Director(name: String, age: Int): Worker(name, age) {
    override fun work() {
        println("manage to process")
    }
}

interface Cleaner {
    fun clean()
}