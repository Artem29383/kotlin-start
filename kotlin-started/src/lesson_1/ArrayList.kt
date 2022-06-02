package lesson_1

fun main() {
    val arrayOf: Array<Int?> = arrayOf(1, 2, 3, 4, 5);
    println(arrayOf[3]);
    arrayOf[2] = null;
    println(arrayOf[2]);

//    val listOfNumbers: List<Int> = ArrayList<Int>();
    val listOfNumbers: MutableList<Int> = mutableListOf<Int>();
    listOfNumbers.add(1)
    listOfNumbers.add(3)
    listOfNumbers.add(2)

    println(listOfNumbers[1])
}