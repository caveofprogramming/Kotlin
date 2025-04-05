fun main() {
    for(i in 0 .. 2) {
        print("$i ")
    }
    println()

    for(i in 10 .. 13) print("$i ")
    println()

    for(i in 10 ..< 13) print("$i ")
    println()

    for(i in 15 downTo 10) print("$i ")
    println()

    for(i in 4 .. 22 step 2) print("$i ")
    println()

    // FYI ....

    for(i in 10.rangeTo(13)) print("$i ")
    println()
    println(2 + 3)
    println(2.plus(3))

    println()
    for(i in IntRange(7, 9)) print("$i ")
}