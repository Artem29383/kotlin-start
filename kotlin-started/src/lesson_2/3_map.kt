package lesson_2

fun transformer(list: List<Int>): List<String> {
    return list.filter {it % 5 == 0 || it % 3 == 0}
        .map {it * it}
        .sortedDescending()
        .map {"num: $it"}
}

fun main() {
    val numbers = (1..100).toList();
    val numbersSquare = numbers.map {it*it};
    val students = numbers.map {"Student №$it"}
    println(numbersSquare)
    println(students)
    println(transformer((1..10).toList()))
}