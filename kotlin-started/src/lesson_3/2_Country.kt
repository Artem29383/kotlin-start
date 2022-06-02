package lesson_3

import java.util.*

class Country(var name: String = "", var population: Long = 0) {
}

class Book(val name: String, var year: Int? = null, var price: Int? = null) {}

class Cat(val name: String, var old: Int,  weight: Float?) {
    val isOld: Boolean
    get() = old >= 12
}

//class Worker(val name: String, val position: String, private val startYear: Int) {
//    val experience: Int
//    get() = Calendar.getInstance().get(Calendar.YEAR) - startYear;
//
//    fun work(): String {
//        return "I working..."
//    }
//}