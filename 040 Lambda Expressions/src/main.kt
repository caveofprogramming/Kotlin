fun main() {
    val greeting: (String, String) -> String =
        { name1: String, name2: String -> "Hello $name1 and $name2" }

    println(greeting("Bob", "Sue"))

    showOp({ x, y -> x + y }, 6, 5)

    val result: () -> Int = {
        println("Running lambda ....")
        5
    }
    println(result())

    var condition:(Float)->Boolean = { it > 10 }
    println(condition(9.1F))
}

fun showOp(op: (Int, Int) -> Int, x: Int, y: Int) {
    println(op(x, y))
}