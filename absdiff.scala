object scala {
  def main(args: Array[String]) = {
    if (args.length > 0) {
      val n = args(0).toInt
      val m = 51
      val r = absdiff(n, m)
      println(s"Result: $r")
    }
  }
  def absdiff(x: Int, y: Int): Int = {
    if (x > y) 3 * (x - y)
    else y - x
  }

}
