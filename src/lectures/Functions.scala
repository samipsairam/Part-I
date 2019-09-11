package lectures

object Functions extends App{

  def aFunction(a: String, b: Int): String =
    a + " " + b

  println("Scala", 3)

  // Parameterless functions can be called just by name
  def aParameterlessFunc(): Int = 42
  println(aParameterlessFunc())

  // function to print a text as many times as second param takes
  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  // WHEN WE NEED LOOPS USE RECURSION
  print(aRepeatedFunction("Scala ", 3))

  // We  can use Unit as return type
  // When we dont want to return any computations we use Unit as a return type
  def aFuncWithSideEffects(aString: String) : Unit = println(aString)

  println(aFuncWithSideEffects("Gopal")) // spits back Nothing since aFuncWithSideEffects() returns Unit

}
