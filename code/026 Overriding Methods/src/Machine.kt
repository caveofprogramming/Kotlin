open class Machine(val name:String) {
    open fun start() {
        println("Starting $name ...")
    }
}

class Car(name:String) : Machine(name) {
    override fun start() {
        println("$name car starting ...")
    }
}

fun main() {
    val machine = Machine("Crusher")
    machine.start()

    val car = Car("Ferrari")
    car.start()
}