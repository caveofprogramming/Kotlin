open class Cat {
    open fun speak() = println("I'm a cat.")
}

open class HouseCat: Cat() {
    override fun speak() = println("I'm a housecat.")
}

class TabbyCat: HouseCat() {
    override fun speak() = println("I'm a tabby cat.")
}

fun Cat.greet() = println("Hello from cat.")
fun HouseCat.greet() = println("Hello from housecat.")
fun TabbyCat.greet() = println("Hello from tabby cat.")

fun main() {
    var doLoop:Boolean = true

    var cat:Cat = Cat()

    while(doLoop) {
        println("Enter 1-3, or 0 to quit > ")
        val input = readln()

        when(input) {
            "1" -> cat = Cat()
            "2" -> cat = HouseCat()
            "3" -> cat = TabbyCat()
            else -> doLoop = false
        }

        cat.speak()
        cat.greet()
    }
}