package lectures.part1basics

import scala.+:
import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computer factorial of " + n + " is: " + result)
      result
    }
  }

  factorial(5)

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }

    factHelper(n, 1)
  }

  println(anotherFactorial(500))

  //WHEN YOU NEED LOOPS, USE TAIL RECURSION

  def concatenateString(n: Int, str: String): String = {
    @tailrec
    def intermediate(x: Int, accumulator: String): String = {
      if (x <= 1) accumulator
      else intermediate(x - 1, accumulator + str)
    }

    intermediate(n, str)
  }

  println(concatenateString(5, "hi"))

  def primeNumberCheck(num: Int): Boolean = {
    @tailrec
    def intermediate(n: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (n <= 1) true
      else intermediate(n - 1, num % n != 0 && isStillPrime)
    }

    intermediate(num / 2, true)
  }

  println(primeNumberCheck(121))
  println(primeNumberCheck(11))

  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(9))

  val num = "2";
  println('a' + num + 'b');
}
