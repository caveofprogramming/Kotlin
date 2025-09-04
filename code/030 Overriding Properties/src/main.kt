open class Id
class ComputerId: Id()


open class Machine {
    open val id:Id = Id()

    open val temperature:Int = 21
        get() {
            println("Getting temperature $field from Machine")
            return field
        }
}

class Computer: Machine() {

    override val id:ComputerId = ComputerId()
    override var temperature = 30
        set(value) {
            println("Setting temperature in computer")
            field = value
        }
}

fun main() {
    val machine = Machine()
    println(machine.temperature)

    val computer = Computer()
    computer.temperature = 40
    println(computer.temperature)
}