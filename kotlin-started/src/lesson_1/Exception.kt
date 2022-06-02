package lesson_1

import java.lang.Exception

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T): Result<T>();
    data class Error(val exception: String): Result<Nothing>();
}

fun sum(a: String, b: String): Result<Any> {
    return try {
        val summary = a.toInt() + b.toInt();
        Result.Success(summary);
    } catch (e: Exception) {
        Result.Error("Ошибка");
    }
}

fun main() {
    println(sum("10", "20"));
    println(sum("10", "2ds0"));
}