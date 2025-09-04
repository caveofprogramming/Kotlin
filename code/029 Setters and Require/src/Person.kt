class Person(name: String) {
    var name: String = name
        set(value) {
            require(value.isNotBlank()) {
                "Name can't be blank."
            }

            field = value
        }
}

fun main() {
    val person = Person("Joe")

    person.name = "Bob"
    println(person.name)
}