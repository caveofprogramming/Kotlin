open class Cat {
    open fun speak() = println("I'm a cat.")
}

open class HouseCat: Cat() {
    override fun speak() = println("I'm a housecat.")
}

class TabbyCat: HouseCat() {
    override fun speak() = println("I'm a tabby cat.")
}

fun Cat.greet() = println("Hello from Cat.")
fun HouseCat.greet() = println("Hello from HouseCat.")
fun TabbyCat.greet() = println("Hello from TabbyCat.")

fun main() {
    while(true) {
        println("Enter 1-3, or 0 to quit > ")
        val input = readln()

        val cat:Cat = when(input) {
            "1" -> Cat()
            "2" -> HouseCat()
            "3" -> TabbyCat()
            else -> break
        }

        cat.speak()
        cat.greet()
    }
}