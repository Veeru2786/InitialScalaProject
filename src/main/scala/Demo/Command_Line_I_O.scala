package Demo

import scala.io.StdIn.{readInt, readLine}

object Command_Line_I_O {
  def main (args:Array[String]): Unit ={

    println("Enter your First Name:- ")
    val firstName = readLine()
    println("Enter your Last Name:- ")
    val lastName = readLine()
    println("Enter your age:- ")
    val age = readInt()
    println(s"First Name: $firstName\nlast name: $lastName\nAge: $age")

  }
}
