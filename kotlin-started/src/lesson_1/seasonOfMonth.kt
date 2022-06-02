package lesson_1

fun getSeasonFromMonth(m: String) : String {
    return when (m) {
        "Декабрь", "Январь", "Февраль" -> "Зима"
        "Март", "Апрель", "Май" -> "Весна"
        "Июнь", "Июль", "Август" -> "Лето"
        "Сентябрь", "Октябрь", "Ноябрь" -> "Осень"
        else -> "Вы указали не месяц года"
    }
}

fun main() {
    println(getSeasonFromMonth("Май"));
    println(getSeasonFromMonth("Декабрь"));
    println(getSeasonFromMonth("Август"));
    println(getSeasonFromMonth("Октябрь"));
    println(getSeasonFromMonth("Летарол"));
}