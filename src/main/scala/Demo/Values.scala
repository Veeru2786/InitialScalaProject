package Demo

// val means we can never change this  value.

object Values {
   def main(args: Array[String]): Unit = {
     val num1 = 1
//  num1 = 2 # this statement showing error.
     println(num1)

  }
}
