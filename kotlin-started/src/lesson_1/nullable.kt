package lesson_1

private var name: String? = null;

fun calculate(a: String?, b: String?, c: String?): Int {
    val result = (a?.length?:0) + (b?.length?:0) + (c?.length?:0);
    return result
}

fun helloName(names: Array<String>): String {
    return ("Hello ${names[0]}");
}

fun conditionName(names: Array<String>, isLast: Boolean): String {
    return if (!isLast) {
        ("Hello ${names[0]}");
    } else {
        ("Hello ${names[1]}")
    }
}

fun main() {
//    val length = name?.length?:0;
//    name = "lala";
//    println(name?.length)
//    println(length)
//
    println(calculate(null, "!null", ""));
    println(helloName(arrayOf("Artem", "Anna")));
    println(conditionName(arrayOf("Artem", "Anna"), true));
}



