package Demo

/*
1. Function is group of statement that perform a particular task.
2. We can also set default value in scala function which is show in function3
3. we can use operator as function name.(+ and ** function)
4. we can also assign a function to a variable. we done  this by anonymous function. like in add variable we assign a function using rocket symbol.
5. HIGHER ORDER FUNCTION :- are those who take arguments and able to return function.like, matx.
6. PARTIALLY APPLIED fUNCTION:-  When we can't use all parameter while calling the function these function is known as partially function, like we use three parameter and we set  default value of 2 parameter, and we never value of those variable in calling time. like PF function in main object.
7. Closures:-  is uses one or more variables declared outside this function.
8. Currying:- is the technique of transforming a function that takes multiple arguments into a function that takes a single arguments.
 */
object UpdatedFunction {
  def function1(x: Int, y: Int):Unit={// first way to declare a function.
    println(x + y)// last statement consider as return statement
  }

  def function2(x : Int, y: Int) = println(x + y) // shortcut way of writing same function

  def function3(x : Int = 10, y : Int = 20 ) = println(x + y) // default value in function
  def **(x : Int , y :Int) = println(x -y) // not a operator loading.

  object Function{// function inside the object.
    def +(x: Int, y: Int) = println(x + y)
  }

  var add= ( x : Int, y: Int) => x + y

  def matx(x: Double, y: Double, f:(Double, Double) => Double): Double =f(x,y)

  var clouserNumber = 10// function declared outside the function but we use inside the function clouserAdd.
  // Clouser take last updated value of the this variable if we change value 10 in the main method then clouser take that updated value instead of 10.
  // if we create that variable using val then we can't change the value, this kind kind clouser is known as pure clouser.
  val clouserAdd = (x: Int) => x + clouserNumber
  def main(args:Array[String]): Unit ={
    function1(10,20)
    function2(20,30)
    function3(0)// we just provide value of first parameter and value of second parameter is default.
    Function.+(1,1)
    **(20,20)
    println(add(1,5))
    val result = matx(50, 20 ,(x,y) => x-y)
    println(result)

    val PF = (a: Int, b: Int, c: Int) => a+b+c
    val f = PF(10, _:Int,_: Int)
    println("Partially Function:- " + f(10,10))

    println("clouser:- " + clouserAdd(20))

  }
}
