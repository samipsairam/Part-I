package lectures

object Recursion extends App {

  def factorial(n: Int) : Int = {
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
    // Each call of Recursion uses Stack
  }
  println(factorial(10))

  def anotherFactorial(n: Int): Int = {
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, s * accumulator)
  }
}
