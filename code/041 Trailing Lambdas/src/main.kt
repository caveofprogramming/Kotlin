fun main() {
    show(6, 7, { x, y -> x + y })

    show(3, 4) { x, y ->
        x * y
    }

    greet({ "I am $it" })

    greet {
        "Hello $it"
    }
}

fun greet(content: (String) -> String) {
    println(content("Bob"))
}

fun show(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x, y))
}
