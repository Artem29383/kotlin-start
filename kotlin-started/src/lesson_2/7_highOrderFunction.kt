package lesson_2

import java.util.*

fun main() {
    println(modifyString("hello ARTEM!", ::modify));
}

inline fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string);
}

fun modify(string: String): String {
    val splitString = string.split(' ');
    return splitString[0][0].toUpperCase() + splitString[0].slice((1 until splitString[0].length)) + " ${splitString[1][0]}" + splitString[1].slice(
        1 until splitString[1].length
    ).toLowerCase(Locale.getDefault());
}