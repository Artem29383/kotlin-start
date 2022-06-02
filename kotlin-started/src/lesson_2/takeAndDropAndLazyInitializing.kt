package lesson_2

fun main() {
    val employees = (1..100).toList().map {"Employee №$it"}
    val first30 = employees.take(30)
    val employeesDrop30 = employees.drop(30)
    println(first30)
    println(employeesDrop30)

//    val evenArray = generateSequence(0) {it + 2}
//    val evenArray = generateSequence {(Math.random() * 100).toInt()}
//        .take(10)
//    for (num in evenArray) {
//        println(num)
//    }

//    val students = generateSequence(1) { it + 1 }.take(100).map {"Student №$it"}
    val students = generateSequence("Сотрудник №1") {
        val index = it.substring(11).toInt();
        "Сотрудник №${index + 1}"
    }.take(30)
    for (st in students) {
        println(st)
    }
}