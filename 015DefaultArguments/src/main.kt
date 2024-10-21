fun main() {
    val result1 = calculateVolume(2.0, 4.0, 6.0)
    println(result1)

    val result2 = calculateVolume(6.0, 7.2)
    println(result2)

    val result3 = calculateVolume(length=1.23)
    println(result3)
}

fun calculateVolume(width:Double=1.0, length:Double, height:Double=1.0):Double {
    return width * length * height
}