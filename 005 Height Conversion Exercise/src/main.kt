fun main() {

    // 1 metre = 3.28 feet

    print("Enter a distance in meters > ")
    val meters = readln()

    val feet = meters.toDouble() * 3.28

    println("${meters}m is equal to ${feet}ft")

    println(meters::class.simpleName)

}