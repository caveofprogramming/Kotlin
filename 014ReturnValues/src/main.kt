fun main():Unit {
    val result = test()
    println(result)

    println(calculate(12.0))
}

fun test():Int {
    return 7
}

fun calculate(value:Double):Double {
    val result = value * 3 + 6.2

    return result
}
