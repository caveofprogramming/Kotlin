fun main() {
    data class Person(val name:String, val age:Int)

    val p1 = Person("Bob", 42)
    val p2 = Person("Bob", 42)

    println(p1)
    println(p1 == p2)

    val p3 = p1.copy(age=20)
    println(p3)

    val (name, age) = p3
    println("$name, $age")

}