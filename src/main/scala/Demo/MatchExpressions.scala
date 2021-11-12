package Demo

/*
1. Match is just like switch in java.
2. It matches best case available in the pattern.
3. Match expression can return case value also.
 */

object MatchExpressions {
  def main(args: Array[String]) {
    var a = 9
    a match{
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("No")
    }
    //    println("Second pattern matching:- " + result)
  }

  def search(a:Any):Any = a match{
    case 1 => println("One")
    case "A" => println("Two")
    case _ => println("Void")
  }


  /*
  with multiple cases
   */
  val i = 7
  i match {
    case 1| 2 | 3 | 4 => println("1234")
    case 5 | 6 | 7 | 8 => println("5678")
  }
}
