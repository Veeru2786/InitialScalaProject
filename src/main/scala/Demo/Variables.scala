package Demo

/*
1. var means we can change this  value.
2. Scope the variable:-
  -Fields:- These methods are
 */

object Variables {

  def main(args: Array[String]): Unit ={

    var num1: Int = 10;
    var num2: Int = 10;
    var result = num1 +  num2
    println("Result is :- " + result)

    // we can do multiple assignment into one statement.
    val (a, b, c) = (1, 2, 3)
  }
}
