class Machine(val name: String) {
    fun start() {
        println("$name starting.")
    }
}

fun Machine.printInfo() {
    println("Identifier: ${this.name}, Version: $version")
}

val Machine.version:Int
    get() {
        return 1
    }

fun main() {
    val m1: Machine = Machine("T1000")
    m1.start()

    m1.printInfo()

    fun Int.greet() {
        println("Hello")
    }

    val number:Int = 7
    number.greet()

    11.greet()
}