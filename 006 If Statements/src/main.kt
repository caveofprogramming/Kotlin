fun main() {
  // ==, !=, <, >, <=, >=

    println("Equality test operator: ${2 == 3}")
    println("Not equal operator: ${2 != 3}")
    println("Less than operator: ${2 < 3}")
    println("Greater than operator: ${2 > 3}")
    println("Less than or equal operator: ${2 <= 3}")
    println("Greater than or equal operator: ${3 >= 3}")

    val temperature = 7

    if(temperature < 0) {
        println("Fridge too cold")
    }
    else if(temperature < 4) {
        println("Fridge OK")
    }
    else if(temperature < 5) {
        println("Fridge too warm")
    }
    else {
        println("Danger zone!")
    }

    println("Finished")
}