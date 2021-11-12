package Demo

object NestedLoop {
  def main(args: Array[String]) {
    var i, j = 0;
    for (i <- 1 to 2; j <- 1 to 2) {
      println("(" + i + "," + j + ")")
    }
  }
}
