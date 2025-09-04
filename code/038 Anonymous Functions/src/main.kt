fun main() {
    val add = fun(x:Int, y:Int):Int = x + y
    val subtract:(Int, Int)->Int = fun(x, y) = x - y

    var result = add(8, 9);
    println(result)

    result = runOp(subtract, 2, 3)
    println(result);

    result = runOp(fun(x, y) = x * y, 3, 6)
    println(result);

    val op = getOp();
    result = op(11, 5)
    println(result);
}

fun getOp():(Int, Int)->Int {
    return fun(x, y) = x/y
}

fun runOp(op:(Int, Int)->Int, x:Int, y:Int):Int {
    return op(x, y)
}
