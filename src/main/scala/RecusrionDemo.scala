object RecusrionDemo {
  def factorial(i: BigInt): BigInt = {
    def fact(i: BigInt, accumulator: BigInt): BigInt = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  def recursiveSum(a: Int, b: Int): Int = {
    def recSum(a: Int, b: Int ,accumulator :Int): Int ={
      if (a > b)
        0
      else
        a + recSum(a + 1, b,accumulator)
    }
    recSum(a,b,0)
  }

  def main(args: Array[String]): Unit = {
    println("Factorial of 5 = "+ factorial(5))
    println("Recursive sum from 1 to 5 = " + recursiveSum(1,5))
  }

}
