
fun main() {
    val fruits = setOf("orange", "banana", "apple", "orange")

    for(fruit in fruits) {
        println(fruit)
    }

    println(fruits)
    println(fruits.indexOf("apple"))

    val people = mutableSetOf("Bob", "Sue")
    people.remove("Bob")
    people.add("Rita")
    people.add("Rita")
    println(people)

    val numbers = sortedSetOf(8,3,5,2,0,9)
    println(numbers)

    val values = linkedSetOf(1.1, 9.8, 2.3, 7.0, 0.0)
    values.add(9.8)
    println(values)

    val stuff = values.union(people);
    println(stuff)

}