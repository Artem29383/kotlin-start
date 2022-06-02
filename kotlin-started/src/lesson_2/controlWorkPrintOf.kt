package lesson_2

fun getPrintInfo(data: Map<String, List<Int>>) {
    val goodMonth = data.filter { list -> list.value.all { it > 0 } };
    val badMonth = data.filter { list -> list.value.any { it <= 0 } };
    val averageWeekly = goodMonth.flatMap { it.value }.average();
    val averageMonth = averageWeekly * 4;
    val sumAllMonth = goodMonth.keys.map { key -> goodMonth[key]!!.sum() };

    val maxRevenueInMonth = sumAllMonth.max()
    val minRevenueInMonth = sumAllMonth.min()

    val maxMonths = goodMonth.filter { it.value.sum() == maxRevenueInMonth?:0 }.keys;
    val minMonths = goodMonth.filter { it.value.sum() == minRevenueInMonth?:0 }.keys;


    println(maxRevenueInMonth)
    println("Средняя выручка за неделю $averageWeekly");
    println("Средняя выручка за неделю $averageMonth");
    println("Максимальная выручка: $maxRevenueInMonth")
    println("Была в месяцах:")
    maxMonths.forEach { println(it) }
    println("Минимальная выручка: $minRevenueInMonth")
    minMonths.forEach { println(it) }
    badMonth.forEach { println(it) }
}

fun main() {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )

    getPrintInfo(data);
}