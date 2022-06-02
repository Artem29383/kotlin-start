package lesson_3

enum class Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULE,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

enum class Seasons(val translate: String) {
    SUMMER("Лето"),
    WINTER("Зима"),
    SPRING("Весна"),
    AUTUMN("Осень"),
}