package lesson_2

fun main() {
//    val age = 5;
//    println(age.isPositive());
//    if (age.isAgeValid()) {
//        println("VALID")
//    }
//
//    if (age.isAgeValid()) {
//        println("TOO VALID")
//    }
//
//    println(5.isPrime())
//    println(6.isPrime())

    val list = listOf<Int>(1, 2, 3, 4, 5)
    val string = "lol"

    myWith(list) {
        println(sum())
        println(average())
    }

    myWith(string) {
        println(toUpperCase())
    }
}

//fun isAgeValid(age: Int) = age in 12..100

fun Int.isAgeValid() = this in 12..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true

    for (i in 2 until this) {
        if (this % i == 0) return false
    }

    return true
}

//fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
//    list.operation()
//}

//fun myWith(string: String, operation: String.() -> Unit) {
//    string.operation()
//}

inline fun<T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}