fun main() {
    var name:String? = "Bob"
    //name = null

    if(name != null) {
        println(name.length)
    }

    println(name?.length)
}