fun add(x:Int, y:Int):Int = x + y

fun main() {
    val value:Int = 7
    println(add(value, 8))

    val sum:(x:Int, y:Int)->Int = ::add

    println(sum(2, 3))

    println("Hello")

    val show:(Any?)->Unit = ::println
    show("Hi there")
}