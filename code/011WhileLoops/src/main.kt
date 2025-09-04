fun main() {

    var command = ""

    while(command != "stop") {
        println("Type 'stop' to finish.")
        command = readln()
    }

    println("Finished 1.")

    var counter = 0

    do {
        println("Counter: $counter")
        counter++
    } while(counter < 4)

    println("Finished 2.")
}