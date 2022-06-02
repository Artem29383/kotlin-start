package lesson_1

fun printAllArray(array: List<Int>) {
    for ((index, num) in array.withIndex()) {
//        println(num);
        println(num * index)
    }
}

fun printNumbersDownTo() {
    for (num in 600 downTo 300 step 5) {
        println(num);
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b;

fun getFiveFirstLetters(str: String) = str.substring(0, 5.coerceAtMost(str.length));

fun sum(vararg numbers: Int): Int {
//    return numbers.reduce { acc, element -> acc + element }
//    return numbers.sum();
    return numbers.fold(0) { acc, element -> acc + element }
}

fun sort(numbers: MutableList<Int>): MutableList<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j - 1];
                numbers[j - 1] = numbers[j];
                numbers[j] = temp;
            }
        }
    }

    return numbers;
}

fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())

fun main() {
//    printAllArray((1..20).toList());
//    printNumbersDownTo();
//    println(max(10, 5));
//    println(getFiveFirstLetters("abcdefgtrds"));
//    println(sum(1, 2, 3, 4, 5, 6));
    println(sort(mutableListOf(4, 7, 3, 2, 1, 5, 6, 5, 10, 11, 9, 111, 200, 150, 300, 500, 301)));
    println(sort(arrayOf(4, 7, 3, 2, 1, 5, 6, 5, 10, 11, 9, 111, 200, 150, 300, 500, 301)));
    println(sort(4, 7, 3, 2, 1, 5, 6, 5, 10, 11, 9, 111, 200, 150, 300, 500, 301));
}