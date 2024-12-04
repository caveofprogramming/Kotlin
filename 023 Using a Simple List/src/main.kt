fun main() {
    val fruits = mutableListOf<String>()

    fruits.add("Kiwi")
    fruits.add("Pear")
    fruits[0] = "Orange"

    println(fruits[1])
    // println(fruits[3]) Out of bounds

    println(fruits)

    for(fruit in fruits) {
        println(fruit)
    }
}