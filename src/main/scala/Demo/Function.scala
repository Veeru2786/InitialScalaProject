package Demo

/*
1. Functions are the expression that have parameters and take arguments.
2. We can define function without name as well which is known as anonymous function.
3.Higher order functions :- Higher order functions are those whose take function as argument and return as well. this is possible because in scala function are first class values
These functions allow to create lambda function or Anonymous function.
     Example of higher order function is map.
     Reason for using higher order function is  reduce redundant code
4. anonymous functions is like little minni function.

 */
object Function {

  def main(args: Array[String]): Unit ={

    //Function with name
    val fun1 = (x: Int) => x + 1
    println(fun1(1))

    // Function with multiple parameters
      val fun2 = (x: Int, y: Int) => x + y
      println(fun2(100, 200))

    // Function with no parameters
    val string = () => "43"
    println(string())

    // Example of map
    val sal = Seq(2000, 7000)
    val fun3 = (x: Int) => x * 2  // fun3 is a function which take single parameter and return x*2 as expression. Left side of this => symbol mostly parameters and right side is generaly value of the expression jeda retun hunda.
    val newSalaries = sal.map(fun3) //Function fun3 is get applies on each element. To shrink this code we can convert this function into anonymous function. which is fun4 and final function is sal5.
    println("Map Example :- " + newSalaries)


    //fun4 anonymous function.
    val sal4 = Seq(1000, 6000)
    val newSalaries4 = sal4.map(x => x * 2) // here we never define type of x variable because compiler can infer the type based on the type of function map.
    println("Map4 Example :- " + newSalaries4)

    // in more idiomatic way same function look like:-
    val sal5 = Seq(1000, 5000)
    val newSalaries5 = sal5.map(_ * 2)

    // Anonymous Function
    val ints = List(1,2,3)
    val doubledInts = ints.map(_ * 2) //  this part is :- anonymous  function "_ * 2". This is the shortest way to saying "Multiply an element by 2.”
/*
1.We create anonymous function of which we never want to reuse the code.
2. We create by using rocket (=>) or by using underscore(_) .
 */

    var result1 = (a:Int, b:Int) => a+b        // Anonymous function by using => (rocket)
    var result2 = (_:Int)+(_:Int)              // Anonymous function by using _ (underscore) wild card
   println("Anonymous Function using rocket operator :- " + result1(10,10))
   println("Anonymous Function using underscore operator :- " + result2(10,10))





  }
}
