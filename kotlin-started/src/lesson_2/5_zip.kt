package lesson_2

fun main() {
//    val phoneList = mutableListOf<Long>()
//    val nameList = mutableListOf<String>()
//    for (i in (111..1111)) {
//        phoneList.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
//        nameList.add("Name $i")
//    }
//
//    val users = nameList.zip(phoneList);
//    for (u in users) {
//        println("Name ${u.first}, phone: ${u.second}")
//    }

    val fullNames = (1..100).map {"Name$it LastName${it + 1}"}
//    val names = fullNames.map {it.substringBefore(" ")}
//    val lastnames = fullNames.map {it.substringAfter(" ")}
//    val fullNamesReverse = lastnames.zip(names);
//
//    for (u in fullNamesReverse) {
//        println("lastName: ${u.first}, name: ${u.second}")
//    }

    val users = fullNames.map {Pair(it.substringBefore(" "), it.substringAfter(" "))}
    for (u in users) {
        println("lastName: ${u.second}, name: ${u.first}")
    }
}