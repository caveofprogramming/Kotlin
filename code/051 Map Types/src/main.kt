import java.util.*

fun main() {
    val people1 = mapOf("Sue" to 33, "Bob" to 42)
    val people2 = mutableMapOf("Sue" to 33, "Bob" to 42)
    people2["Rita"] = 53

    val people3 = sortedMapOf("Sue" to 33, "Bob" to 42)
    val people4 = TreeMap<String, Int>()
    people4["Roy"] = 22
    people4["Clare"] = 55

    val people5 = linkedMapOf("Sue" to 33, "Bob" to 42)

    val people = people5
    for((name, age) in people) {
        println("$name: $age")
    }
}