interface Bank {
    var balance:Int
    fun closeAccount()

    fun withdraw(amount:Int) {
        balance -= amount
    }

    fun printBalance() {
        println("Balance is $balance")
    }
}

class AtlantisBank: Bank {
    override var balance:Int = 0

    override fun closeAccount() {
        println("Closing account ...")
    }

    fun printInfo() {
        println("This is Atlantis Bank")
    }
}

fun main() {
    val bank1: Bank = AtlantisBank()
    bank1.closeAccount()
    bank1.withdraw(5)
    bank1.printBalance()

    withdrawAndPrint(bank1)
}

fun withdrawAndPrint(bank:Bank) {
    bank.withdraw(20)
    bank.printBalance()
}