package Demo

import sun.security.ssl.SSLLogger.info

// Within block we can combine expressions by {}. Which statement we write at the end of block that is the final result of our block.

object Blocks {
  def main(args : Array[String]): Unit ={
    println({
      val x = 1 + 1
      x + 1
    })
  }
}

class Info{
  info("Info method from Object")
}
