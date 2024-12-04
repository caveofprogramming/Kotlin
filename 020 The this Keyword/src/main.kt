class Person

@OptIn(ExperimentalStdlibApi::class)

fun main() {
    val person1 = Person()
    val person2 = Person()

    println(person1)
    println(person2)

    println(person1.hashCode().toHexString())
    println(person2.hashCode().toHexString())
}