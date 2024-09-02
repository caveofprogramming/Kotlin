fun main() {
    /*
    ==, <, >, <=, >=, !=
     */

    println(3 < 5)
    println(3 > 5)
    println(5 == 5)
    println(4 != 5)
    println(5 <= 5)
    println(3 >= 4)

    val temperature = 25

    if(temperature < 21) {
        println("Turn on heating")
    }

    if(temperature > 27) {
        println("Turn on air conditioning")
    }
    else {
        println("Temperature is OK")
    }

    if(temperature < 20) {
        println("Turn on heating")
    }
    else if(temperature < 27) {
        println("No action")
    }
    else {
        print("Turn on air conditioning")
    }
}