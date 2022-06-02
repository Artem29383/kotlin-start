package lesson_3

class Calculate {
    companion object {
        const val PI = Math.PI;
        fun square(number: Int) = number * number
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}

class MyRandom {
    companion object {
        fun randomInt(from:Int, to:Int) = (Math.random() * (to - from + 1)).toInt() + from
        fun randomBoolean() = randomInt(0, 1) > 0
        fun randomDayOfWeek(): String {
            return when(randomInt(1, 7)) {
                1 -> "Monday"
                2 -> "Tuesday"
                3 -> "Wednesday"
                4 -> "Thursday"
                5 -> "Friday"
                6 -> "Saturday"
                else -> "Sunday"
            }
        }
    }
}