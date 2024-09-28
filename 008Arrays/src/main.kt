fun main() {
    val text = arrayOf("Jan", "Feb", "Mar")

    println(text[0])
    println(text[1])
    println(text[2])

    text[2] = "Hello"
    println(text[2])

    val numbers1 = intArrayOf(3, 5, 7)
    println(numbers1[2])
    println(numbers1.contentToString())
    println(numbers1)

    // Don't do this! Should use intArrayOf
    val numbers2 = arrayOf(3, 5, 7)
    println(numbers2[2])
    println(numbers2.contentToString())
    println(numbers2)

    println()
    // Don't do this! Only put one type in arrays.
    val values = arrayOf(3, 5, 7, 7.3, "Hello")
    println(values[2])
    println(values.contentToString())
    println(values::class.simpleName)
}