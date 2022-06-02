package lesson_3

class `1_User` {
    var age: Int = 0
    var name: String = ""
    get(): String {
        return if (field == "") {
            "undefined"
        } else {
            field
        }
    }
}