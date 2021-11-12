package Demo

import java.io.{FileNotFoundException, IOException}

/* 1. In try catch scala uses the same syntax that match expression is used like case statement for matching the possible exception.
2. by try catch we can handle the exception .
3. The try block is used to enclose suspect code. The catch block is used to handle exception occurred in try block. You can have any number of try catch block in your program according to need.
4. catch handler with two case
 */

class Try_Catch{
  def divide(a:Int, b:Int): Unit ={
    try
    {
      a/b
    }catch {
      case e: ArithmeticException => println(e)
    }
    println("Next code......")
  }
}

object o6b {
  def main(args:Array[String]): Unit ={
   var e = new Try_Catch()
   e.divide(100,0)
  }
}

class Try_Catch2{
  def div(a:Int, b:Int): Unit ={
    try{
      a/b
      var arr = Array(1,2)
      arr(10)
    } catch {
      case e: ArithmeticException => println(e)
      case ex: Throwable=> println("Found a unknown exception"+ ex) // when you don't know about the type of exception, you can use super class.
    }
    println("rest of the code......")
  }
}
object ob2{

  def main(array: Array[String]): Unit ={
    var e = new Try_Catch2()
    e.div(100,10)

  }
}
