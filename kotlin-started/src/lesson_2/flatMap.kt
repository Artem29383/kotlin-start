package lesson_2

fun main() {
//    val revenueWeek = listOf(
//        listOf(1, 2, 3, 4, 5),
//        listOf(11, 25, 35, 454, 235),
//        listOf(13, 35, 73, 664, 15),
//        listOf(15, 65, 553, 44, 25),
//    )
//
//    println(revenueWeek.flatten().average())

    val averageData = mapOf(
        Pair("File 1", listOf(1, 2, 3, 4, 5)),
        Pair("File 2", listOf(15, -42, 33, 14, 25)),
        Pair("File 3", listOf(21, 24, 35, 674, 65))
    ).filter { list -> list.value.all { it > 0 } }.flatMap { it.value }.average()

    println(averageData)
}