open class Tiger

class Cat: Tiger() {
    fun speak() {
        println("Meeouw")
    }
}

fun main() {
    val bob:Tiger = Cat()
    (bob as Cat).speak()

    println(bob.javaClass)

    val x = bob as? Int
    println(x)
}