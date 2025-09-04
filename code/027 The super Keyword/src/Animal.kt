open class Animal(val name:String) {
    open fun speak() {
        println("I'm an animal called $name")
    }
}

class Cat : Animal {
    override fun speak() {
        super.speak()
        println("Meeeouuw")
    }

    constructor (name:String) : super(name) {

    }

    constructor (name:String, id:Int) : this(name) {
        println(id)
    }

}

fun main() {
    val cat = Cat("Bob", 7)
    cat.speak()
}