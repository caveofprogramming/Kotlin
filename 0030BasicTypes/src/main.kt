fun main() {
    var value1:Int = 7
    println(value1::class.simpleName)
    println(value1)

    val value2:Byte = 127
    val value3:Short = 32_767
    val value4:Int = 12345678
    val value5:Long = 1234345351L

    val value6:UShort = 33_767u

    val value7:Double = 1.23456780123456
    println(value7::class.simpleName)
    println(value7)

    val value8:Float = 1.23f
    println(value8::class.simpleName)
    println(value8)

    val value9:String = "Hello there"
    println(value9::class.simpleName)

    val value10:Char = 'g'
    println(value10::class.simpleName)

    var value11 = 7.8
    println(value11::class.simpleName)

    value11 = 1.0
}