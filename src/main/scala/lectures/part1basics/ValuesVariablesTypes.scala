package lectures.part1basics

object ValuesVariablesTypes extends App {

  //vals are immutable
  val x: Int = 42
  println(x)

  //compiler can infer types
  val y = 43

  //semi-colons are not necessary
  val aString: String = "Hello"
  val anotherString = "Hello from me"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4500
  val aLong: Long = 5600000000067777788L
  val aFloat: Float = 2.0F
  val aDouble: Double = 2.13D

  //variables
  var aVariable: Int = 4
  aVariable = 5 //side effects
}