object SumTriple {
  def main(args: Array[String]): Unit = {
    // Example inputs:
    val a = 10
    val b = 10

    // Compute the result using the sumTriple function
    val result = sumTriple(a, b)

    // Print the result
    println(s"Result: $result")
  }

  /** Returns the sum of x and y. If x and y are the same, returns triple the
    * sum.
    */
  def sumTriple(x: Int, y: Int): Int = {
    if (x == y) 3 * (x + y)
    else x + y
  }
}
