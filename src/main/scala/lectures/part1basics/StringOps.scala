package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"
  println(str.charAt(5))
  println(str.substring(5, 9))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("I am", "you are"))
  println(str.length)
  val aNumber: String = "77"
  println('a' +: aNumber :+ 'y')
  println(str.take(4))

  //Scala-specific interpolators

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old."
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(greeting)
  println(anotherGreeting)

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
