object S {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      println("This " + args(0) + "!")
    } else {
      println("No arguments provided!")
    }

    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }
}
