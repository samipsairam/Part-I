package exercises

object FunctionBasic extends App{

  // A greeting function(name, age) => Hi, I am $name, I am $age years old
  def greetFunc(name: String, age: Int): String =
    "Hi, I am " + name + ", I am " + age + " years old."

  println(greetFunc("Rohan", 21))

  // Factorial function 1 * 2 * 3 * 4 = 4!
  def aFactoralFunc(num: Int): Int = {
    if(num <= 0) 1
    else num * aFactoralFunc(num - 1)
  }
  println(aFactoralFunc(4))

  // Fibonacci numbers 1 1 2 3 5 8 13 21
  def aFibonacciFunc(n: Int): Int = {
    if(n <= 2) 1
    else aFibonacciFunc(n - 1) + aFibonacciFunc(n - 2)
  }
  println(aFibonacciFunc(8))

  // Test if a number is Prime
  def isPrime(n: Int): Boolean = {
    // auxilarry function
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
  print(isPrime(37))

}
