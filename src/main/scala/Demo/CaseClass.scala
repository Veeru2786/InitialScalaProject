package Demo

/*
1.Its like regular classes with a few key differences which we will go over. Case classes are good for modeling immutable data.
2. When the compiler sees the case keyword in front of a class, it generates code for you, with the following benefits:
    - By default constructor parameters are public val.
    - We don’t need to use the new keyword to create a new instance of the class., because APPLY method is created.
    - We compare object very easily and use them as a key in map, because EQUAL and HashCode method generated.
    - A default toString method is generated.
3. All the parameters listed in the case class are public and immutable by default.

 */
case class CaseClass(a:Int, b:Int)

object MyObject{
  def main(args:Array[String]){
    var c =  CaseClass(10,10)       // Creating object of case class
    println("a = "+c.a)               // Accessing elements of case class
    println("b = "+c.b)
  }
}
