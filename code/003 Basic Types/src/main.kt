fun main() {
    var value1:Int = 7
    println(value1::class.simpleName)
    println(value1)

    // value1 = 2.1
    // println(value1)
    println(7::class.simpleName)
    println(1.2::class.simpleName)

    var value2:Double = 2.3
    println(value2::class.simpleName)
    value2 = 6.8

    var text1:String = "Hello"
    println(text1::class.simpleName)
    text1 = "Hi"
    println(text1)

    var letter:Char = 'f'
    println(letter)
    println(letter::class.simpleName)

    val value3:UInt = 123U
    val value4:Float = 1.23F
    val value5:ULong = 1234UL

    /*
    Integer
    Byte        8
    Short       16
    Int         32
    Long        64

    UByte, UShort, UInt, ULong

    Floating-point
    Double      64
    Float       32
     */
}