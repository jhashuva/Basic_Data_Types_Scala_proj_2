object DataTypes extends App{
    val c: Byte = 1
    println(s"c:${c}")
    println(s"c Data Type ${c.getClass}")
    val i: Int = 1
    println(s"i :${i}")
    println(s"i Data Type ${i.getClass}")
    val l: Long = 1
    println(s"l :${l}")
    println(s"l Data Type ${l.getClass}")
    val s: Short = 1
    println(s"s :${s}")
    println(s"s Data Type ${s.getClass}")
    val d: Double = 2.0
    println(s"d :${d}")
    println(s"d Data Type ${d.getClass}")
    val f: Float = 3.0
    println(s"f :${f}")
    println(s"f Data Type ${f.getClass}")
    val j = 123 // defaults to Int
    println(s"j :${j}")
    println(s"j Data Type ${j.getClass}")
    val k = 1.0 // defaults to Double
    println(s"k :${k}")
    println(s"k Data Type ${k.getClass}")
    val x = 1_000L // val x: Long = 1000
    println(s"x :${x}")
    println(s"x Data Type ${x.getClass}")
    val y = 2.2D // val y: Double = 2.2
    println(s"y :${y}")
    println(s"y Data Type ${y.getClass}")
    val z = 3.3F // val z: Float = 3.3
    println(s"z :${z}")
    println(s"z Data Type ${z.getClass}")
    var a = BigInt(1_234_567_890_987_654_321L)
    println(s"a :${a}")
    println(s"a Data Type ${a.getClass}")
    var b = BigDecimal(123_456.789)
    println(s"b :${b}")
    println(s"b Data Type ${b.getClass}")
    val name = "Bill" // String
    val ch = 'a' // Char
    val firstName = "John"
    val mi = 'C'
    val lastName = "Doe"
    println(s"Name: $firstName $mi $lastName") // "Name: John C Doe"
    println(s"2 + 2 = ${2 + 2}") // prints "2 + 2 = 4"

    val w = -1
    println(s"x.abs = ${w.abs}") // prints "x.abs = 1"

    val quote =
      """The essence of Scala:
               Fusion of functional and object-oriented
               programming in a typed setting."""

}
