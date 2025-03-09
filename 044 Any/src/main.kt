class Cat(val name:String) {
    override fun toString(): String {
        return "I am $name, a cat."
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cat

        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}


fun main() {
    val cat1:Cat = Cat("Bob")
    val cat2:Cat = Cat("Bob")

    println(cat1)
    println(cat2)

    val text:String = "Some cat: $cat1";
    println(text)
    println(cat2.toString())

    val cat3 = cat1
    println(cat1 === cat3)

    println(cat1 == cat2)
}