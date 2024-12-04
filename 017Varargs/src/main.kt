fun displayFruit(vararg fruits:String) {
    for(fruit in fruits) {
        println(fruit)
    }
}

fun main() {
    displayFruit("banana", "apple", "orange")

    val fruits = arrayOf("kiwi", "pear", "grape", "persimmon")

    displayFruit(*fruits)
}