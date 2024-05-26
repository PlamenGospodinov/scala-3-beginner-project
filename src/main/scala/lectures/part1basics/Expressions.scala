package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)
  println(2 + 3 * 8)
  println(1 == x)
  println(1 != 2)

  var aVariable = 3
  aVariable += 4
  println(7 == aVariable)

  //Instructions(DO) vs Expressions(VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 6 else 4)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  } //NOT RECOMMENDED

  // EVERYTHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  val someOtherValue = {
    if (true) "hello" else "goodbye"
    455
  }
  println(someOtherValue)

  def func() = {
    var x = List("hi", "lo")
    var y = for (elem <- x if (elem.contains("h")))
      yield elem
    println(y)
  }

  func()
}
