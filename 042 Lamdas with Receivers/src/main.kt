fun main() {
    "Bob".greet()

    var greeting:String.()->Unit = String::greet
    "Sue".greeting()
    greeting("Pete")
    (String::greet)("Rita")

    greeting = { println("Hi $this") }
    "Steve".greeting()
    greeting("Steve")
}

fun String.greet():Unit {
    println("Hello $this")
}