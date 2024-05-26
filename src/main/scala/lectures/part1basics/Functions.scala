package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int) = {
    a + " " + b
  }

  println(aFunction("hello", 3000))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  //When you need loops, use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  def greet(name: String, age: Int): Unit = {
    println("Hi, my name is " + name + " and I am " + age + " years old")
  }

  greet("Plamen", 22)

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else {
      fibonacci(n - 2) + fibonacci(n - 1)
    }
  }

  println(fibonacci(7))

  def primeNumberCheck(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else !(2 to (num - 1)).exists(num % _ == 0)
  }

  println(primeNumberCheck(9))
  println(primeNumberCheck(97))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(8))
}
