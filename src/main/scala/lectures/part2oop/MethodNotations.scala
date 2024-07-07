package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, val favouriteMovie: String, val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favouriteMovie

    def hangOutWith(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    def unary_! : String = s"$name, what the heck?"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"

    def +(nickname: String): Person = {
      new Person(name + s" $nickname", favouriteMovie)
    }

    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)

    def learns(language: String): Unit = println(s"$name learns $language")

    def learnsScala(): Unit = this learns "Scala"

    def apply(repetitions: Int): Unit = println(s"$name watched her favourite movie $favouriteMovie $repetitions times")
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //infix notation = operator notation(syntactic sugar)

  //"operators" in Scala
  val tom = new Person("Tom", "Fight club")
  println(mary hangOutWith tom)

  //prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_ prefix works only with + - ~ !
  println(!mary)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) // equivalent

  /* 1.Overload the + operator which receives a string and returns a new person with a nickname
   2.Add an age to the Person class with default 0 value and add unary + operator and
   returns a new person with the age + 1
   e.g +mary => mary's age is incremented
  3.Add a learns method in the Person class =>
  "Mary learns Scala" for e.g
  Add a learnsScala method which calls learns with Scala
  parameter. Use it in postfix notation.
  4. Overload the apply to receive a number
  and return "Mary watched her favourite movie ... n times.
   */

  println(+mary)
  mary learns "Java"
  mary.learnsScala()
  mary(5)

  println((mary + "the great").name)
}
