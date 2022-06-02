package lesson_3

import lesson_3.Months.*
import lesson_3.Seasons.*

fun main() {
//    //#lesson 1
//    val user = `1_User`();
//    user.age = 25
//    user.name = "Artem"
//    println("Name: ${user.name}, Age: ${user.age}")

    //#lesson 2
//    val russia = Country("Russia", 149_000_000)
//
//    val book = Book("Harry Potter")
//    book.price = 500
//    book.year = 2000
//
//    val cat = Cat("Barsik", 5, 4f)
//
//    println(cat.isOld)
//    cat.old = 13
//    println(cat.isOld)
//
//    val employee = Worker("San", "Trydiaga", 2015)
//    employee.printInfo()


   /* //#lesson 6
    val student1 = Student("Ivan", "Ivanod", "1050")
//    val student2 = Student("Ivan", "Ivanod", "1050")
    val student2 = student1.copy()
    println(student1)
    println(student2)
    println(student1.hashCode())
    println(student2.hashCode())
    println(student1 == student2)
    println(student1 === student2)
    val (name, lastname, id) = student1
    println(name)
    println(lastname)
    println(id)*/

   /* val season = when(MARCH) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER.translate
        MARCH, APRIL, MAY -> SPRING.translate
        JUNE, JULE, AUGUST -> SUMMER.translate
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN.translate
    }
    println(season)*/

    /*val dog = Dog(13f)
    dog.eat()
    dog.run()
    println(dog.name)
    println(dog.weight)
    println(dog.habitat)*/

    /*val workers = mutableListOf<Worker>()
    workers.add(Seller("Andrey", 22))
    workers.add(Seller("Sasha", 25))
    workers.add(Programmer("Artem", 25, "Javascript"))
    workers.add(Programmer("Victor", 30, "Ruby"))
    workers.add(Director("Anna", 23))
    workers.add(Director("Alisa", 22))
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
//    for (worker in workers) {
//        worker.work()
//        if (worker is Cleaner) {
//            worker.clean()
//        }
//    }
    for (cleaner in cleaners) {
        cleaner.clean()
    }*/


    //Anonymous class
    travel(object : Transport("Bus") {
        override fun drive() {
            println("${this.name} rides")
        }
    })

    val car = Car()
    car.stopCar { println("${car.name} stopped!!!!!!") }


    // 13 lesson calculate
    println(Calculate.lengthOfCircle(5f))

    // 14 lesson db singleton
//    val db = Database.getInstance()
//    val db = DatabaseObject
//    db.insertData("1")
//    db.insertData("2")
//    val testDB = DatabaseTest()
//    testDB.insertData("3")
//    for (str in db.data) {
//        println(str)
//    }

//    // 15 lesson generic
//    val list: MyList<String> = MyArrayList()
//    for (i in 0 until 10) {
//        list.add("$i")
//    }
//    list.remove("3")
//    list.removeAt(1)
//    for (i in 0 until list.size()) {
//        println(list.get(i))
//    }

    // 16 lesson generic myList
    val list: MyList<String> = MyArrayList.myListOf("1", "2", "3", "4", "5")

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}

fun travel(transport: Transport) {
    transport.drive()
}

//fun Cat.isOld() = old >= 12

//fun Worker.printInfo() {
//    println("Name: $name, experience $experience, work: ${work()}")
//}