class Person(val name:String) {
    fun show(greeting:String) {
        println("$greeting $name");
    }
}

fun main() {
    val p = Person("Bob")
    p.show("My name is");

    val greet:Person.(String)->Unit = Person::show
    p.greet("I am")
    greet(p, "This is")
}