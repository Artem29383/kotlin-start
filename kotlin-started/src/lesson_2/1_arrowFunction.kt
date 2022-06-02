package lesson_2

val sum: (Int, Int) -> Int = {a, b -> a + b}
val square: (Int) -> Int = {it * it}
val greeting: (String) -> String = {"Hello $it"}


val compareTo = Comparator { a: Int, b: Int -> b - a }
val sortingDown: (MutableList<Int>) -> List<Int> = {
    it.sortWith(compareTo);
    it;
}

//fun sortingDown(list: MutableList<Int>): List<Int> {
//    list.sortWith(compareTo);
//    return list;
//}

fun main() {
    println(sum(4, 17));
    println(square(4));
    println(greeting("Artem"));
    println(sortingDown(mutableListOf(2, 5, 4, 3, 6, 7, 2, 1)))
    println(arrayOf(1, 4, 2, -5, -10, 6, 55, 99).sortedDescending())
}