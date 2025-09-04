class Person(val name:String?)

fun main() {
    //val person:Person = Person("Bob")
    val person:Person? = null
    //val person:Person = Person(null)

    println(person?.name?.length ?: 0)
}