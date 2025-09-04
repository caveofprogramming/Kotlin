class Person(val name:String) {
    val awards = mutableListOf<String>()

    constructor(name:String, vararg awards:String) : this(name) {
        this.awards.addAll(awards)
    }

    fun displayInfo() {
        println(name)
        println("---")

        if(awards.isEmpty()) {
            println("No awards")
        }
        else {
            for(award in awards) {
                println(award)
            }
        }
    }
}

fun main() {
    val person1 = Person("Bob")
    val person2 = Person("Claire", "Nobel Prize", "Fields Medal")

    person1.displayInfo()
    println()
    person2.displayInfo()
}