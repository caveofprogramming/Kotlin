fun main() {
    info("Bob", 52, 183)
    info(age=37, name="Sue", height=170)
    info("Pete", height=175, age=25)
}

fun info(name:String, age:Int, height:Int) {
    println("$name: age $age, height $height")
}