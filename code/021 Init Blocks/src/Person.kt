class Person(name:String) {

    init {
        println("init 1: ${name}")
    }

    val name:String = name.uppercase()

    init {
        println("init 2: ${this.name}")
    }

    fun speak() {
        println("Hello, I'm $name")
    }
}

fun main() {
    val person = Person("Bob")
    person.speak()
}