package lesson_1

fun getInfo(name: String = "", lastname: String = "", patronymic: String = "") {
    if (name.isNotEmpty()) {
        println("Имя: $name")
    }

    if (lastname.isNotEmpty()) {
        println("Фамилия: $lastname")
    }

    if (patronymic.isNotEmpty()) {
        println("Отчество: $patronymic")
    }
}

//fun getInfo(name: String, lastname: String) {
//    getInfo(name, lastname, "");
//}

fun getVolumeFigure(a: Int, b: Int = a, c: Int = a) = a*b*c;

fun main() {
    getInfo("Artem", "Averyanov", "Dmitrievich")
    getInfo("Anna", "Averyanova")
    getInfo(lastname = "Grigorieva")

    println(getVolumeFigure(3, 4, 5));
    println(getVolumeFigure(3));
    println(getVolumeFigure(3, 4));
}