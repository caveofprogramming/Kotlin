fun main() {
    val months = arrayOf("Jan", "Feb", "Mar")

    for (i in 0..< months.size) {
        println(months[i])
    }

    for(month in months) {
        println(month)
    }

    for(i in months.indices) {
        println(months[i])
    }

    for((i, month) in months.withIndex()) {
        println("${i + 1} $month")
    }
}