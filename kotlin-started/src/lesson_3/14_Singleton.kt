package lesson_3

class Database private constructor() {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }

    companion object {
        var db: Database? = null

        fun getInstance(): Database {
            db?.let {
               return it
            }
            val instance = Database()
            db = instance
            return instance
        }
    }
}

object DatabaseObject {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }
}

class DatabaseTest {
    fun insertData(str: String) {
//        Database.getInstance().insertData(str)
        DatabaseObject.insertData(str)
    }
}