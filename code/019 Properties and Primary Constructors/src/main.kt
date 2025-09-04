class Person(private val name:String, age:Int = 20) {

    var age:Int = age + 10

    fun speak() {
        age -= 10
        println("Hello I'm $name, I'm $age years old.")
    }
}

fun main() {
    val p1 = Person("Bob", 52)
    p1.speak()

    val p2 = Person("Claire", 39)
    p2.speak()

    val p3 = Person("Vic")
    p3.speak()
}