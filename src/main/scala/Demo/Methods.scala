package Demo

/*
 1. Methods is set of statements when ever we want to execute some
    task many time then we add those statement within function and call that Methods  where we want to perform that particular task again.
 2. Methods have parameters and take arguments.
 3. We can create scala Methods using "def" keyword.
          def MethodsName(parameters:TypeOfParameters):ReturntypeOfMethods={
            //statements to be executed
           }
  4. If we use = operator this means Methods will return the value else nothing return if we never used = operator.
 5. Type of the Methods is optional but type of parameters is important. By default returnType of Methods is Unit.
 6. We can pass Methods as argument and return Methods as value from other Methods.
 7. Scala Methods never use any return statement compiler consider last statement as A return statement.
 8. Recursive Methods :- In recursive Methods, Methods definition calling itself.
    Recursive Methods take some input and divided that into smaller parts and solve that small parts after that combine all the smaller parts.
    In recursive Methods there must be base condition for terminate the program safely.
9.  Methods and Function both are same but difference is that for creating Methods for use Def keyword.
 10 . Methods are also have multiLine expressions.


 */

object Methods {

  var sum: Int = _

  def main(args : Array[String]): Unit ={
    firstMethods()

    var result = secondMethods()
    println(result)

    thirdMethods(10, 10)

    forthMethods(4)

    var result1 =  fifthMethods(10, 20)
    var result2 =  fifthMethods()
    println(result1 + "\n" + result2)


    var result3 =  sixMethods(a = 33, y = 34 )
    println(result1 + "\n" + result2)

  }


  //With = operator.
  def firstMethods(): Unit ={
    println("Hello Xenonstack!!...")
  }


  //WithOut = operator.
  def secondMethods(){ // If i add = operator then it will then return 10 otherwise it will return util (means () brace means nothing information.).
    var value = 10
    value
  }


  // Parameterized Methods.
  def thirdMethods(num1: Int, num2: Int ): Unit ={
    sum= num1+ num2
    println(sum)
  }


  // Recursive Methods
  def forthMethods(n : Int): Unit ={
    if(n > 0){
      println(n + " , ")
      forthMethods(n-1)
    }
    else{
      println(n + ".")
    }
  }


  //Methods with parameter + default value.
  def fifthMethods(a:Int = 0, b:Int = 0): Int ={
    a+b
  }

  //In scala we can declare name of variable during the calling of Methods.
  def sixMethods(a:Int = 10, y:Int = 20): Int = {
    a+y
  }

}
