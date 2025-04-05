fun main() {
    val empty = false

    val status1 = if(empty) {
        "Refill"
    }
    else {
        "OK"
    }

    println(status1)

    val status2 = if(empty) "refill" else "OK"
    println(status2)
}