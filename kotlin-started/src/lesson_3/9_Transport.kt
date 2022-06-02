package lesson_3

abstract class Transport(open val name: String) {
    abstract fun drive()
}

class Car(override var name: String = "Car"): Transport(name) {
    override fun drive() {
        println("Car rides")
    }

    fun startEngine(): Boolean {
        if (Math.random().toInt() > 0.5) {
            println("The car started")
            return true
        }

        println("Unsuccessful attempt")
        return false
    }

    inline fun stopCar(stopper: () -> Unit) {
        stopper()
    }
}

class Bike(override var name: String = "Bicycle"): Transport(name) {
    override fun drive() {
        println("Bike rides")
    }
}

