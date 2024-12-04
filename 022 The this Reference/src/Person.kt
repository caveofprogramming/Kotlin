class Person(val name:String) {
    init {
        println("Hello I'm ${this.name}")
    }
}

fun main() {
    val person1 = Person("Bob")
    println(person1.name)
    val person2 = Person("Claire")
    println(person2.name)
}
