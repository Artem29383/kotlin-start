package lesson_2

//var name: String? = "null";
val list: MutableList<Int>? = mutableListOf();

fun main() {
//    name?.let {
//        if (it.length > 3) {
//            println(it)
//        }
//    }

//    val list = mutableListOf<Int>()
//    with(list) {
//        for (i in 0 until 1000) {
//            add((Math.random() * 100).toInt())
//        }
//        println(sum())
//        println(average())
//        println(maxByOrNull(square))
//        println(minByOrNull(square))
//        println(first())
//        println(last())
//    }

    list?.let { it ->
        with(it) {
            for (i in (0..1000)) {
                add((Math.random() * 100).toInt())
            }
            val result = filter { it % 2 == 0 }
                .take(10)
            println(result)
        }
    }
}