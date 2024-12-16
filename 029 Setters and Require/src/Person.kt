
class FinancialInstrument(var code:String) {
    val name:String
        get() {
            return code.uppercase()
        }
}

fun main() {
    val fi = FinancialInstrument("abcde")
    println(fi.code)
    println(fi.name)

    fi.code = "zyxwv"
    println(fi.name)
}
