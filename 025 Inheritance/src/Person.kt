open class Person(val name:String) {
    fun speak() {
        println("Hello I'm $name")
    }
}

class Employee(name:String): Person(name) {
    fun onHoliday() {
        println("I'm on holiday")
    }
}

fun main() {
    val emp = Employee("Bob")
    emp.speak()
    emp.onHoliday()
}