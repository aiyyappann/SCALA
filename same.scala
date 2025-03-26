object scala {
  def main(args: Array[String]) = {
    if (args.length > 0) {
      val n = args(0).toInt
      val m = args(1).toInt
      val r = same(n, m)
      println(s"Result: $r")
    }
  }
  def same(x: Int, y: Int): Boolean = {
    if (x == 30 || y == 30) true
    else false
  }

}
