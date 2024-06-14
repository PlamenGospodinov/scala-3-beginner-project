package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 22)
  println(person.age)
  person.greet("Ivan")

  val author = new Writer("Ivan", "Minchov", 1850)
  val imposter = new Writer("Ivan", "Minchov", 1850)
  val novel = new Novel("Under the Yoke", 1888, author)

  println(novel.getAuthorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.increase.print
  val counter3 = new Counter(1)
  counter.decrease(4).print

  val ivan = Programmer("Ivan Ivanov", "Java", 2)
  ivan.getInfo()
}

//constructor
class Person(val name: String, val age: Int = 0) {
  //body
  val x = 2

  println(x + 1)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Due")
}

class Programmer(val name: String, val language: String, val experience: Int) {

  def getInfo() : Unit = println(s"${this.name} is a programmer working " +
    s"with ${this.language} and has ${this.experience} years of experience.")
}

//class parameters are not fields

//Novel and a Writer class

class Writer(val firstName: String, val surname: String, val yearOfBirth: Int) {
  def getFullName(): Unit = {
    println(s"$firstName $surname")
  }
}

class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {
  def getAuthorAge(): Int = {
    yearOfRelease - author.yearOfBirth
  }

  def getAuthor(): Unit = {
    println(s"The author is: ${author.getFullName()}")
  }

  def isWrittenBy(author: Writer) = author == this.author

  def copy(year: Int): Novel = {
    new Novel(name, year, author)
  }
}

class Counter(val num: Int = 0) {

  def increase = {
    println("Incrementing")
    new Counter(num + 1)
  }

  def decrease = {
    println("Decrementing")
    new Counter(num - 1)
  }

  def increase(n: Int): Counter = {
    if (n <= 0) this
    else increase.increase(n - 1)
  }

  def decrease(n: Int): Counter = {
    if (n <= 0) this
    else decrease.decrease(n - 1)
  }

  def print = println(num)
}
