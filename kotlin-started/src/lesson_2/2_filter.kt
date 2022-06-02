package lesson_2

fun main() {
    val listNumbers = mutableListOf<Int>();
    for (i in 0..100) {
        listNumbers.add(i);
    }
//    val eventList = listNumbers.filter { number: Int -> number % 2 == 0 }
    val evenList = listNumbers.filter { it % 2 == 0 }
    println(evenList);

    val listNames = mutableListOf<String>("Artem", "Anna", "Sergey", "Victor", "Anastasia", "Irina", "Jane");
    val startWithANameList = listNames.filter { it.startsWith("A") }
    println(startWithANameList);
}