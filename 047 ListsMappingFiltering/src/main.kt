fun main() {
    val numbers1 = ArrayList<Int>()
    numbers1.add(58)

    val numbers2 = mutableListOf(1, 5, 4, 8, 5, 3)

    println(numbers2.size)
    println(numbers2.count())
    println(numbers2.sum())

    for(num in numbers2) {
        print("$num ")
    }
    println()
    println(numbers2)

    numbers2.forEach(::println)
    numbers2.forEach({ print("$it ") })
    println()
    numbers2.forEach{ x->print("$x ") }
    println()
    numbers2.forEachIndexed{ i, x->print("$i:$x ") }
    println()

    val numbers3 = numbers2.sortedDescending()
    println(numbers3)

    val numbers4 = numbers2.map{ it * 100 }
    println(numbers4)

    val numbers5 = numbers2.filter{ it % 2 == 0 }
    println(numbers2)
    println(numbers5)
}