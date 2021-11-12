package Demo

/*
1. companion object :- An object with the same name as a class is called a companion object.
2. when the following code is saved in a file named Obj.scala, the Obj object is considered to be a companion object to the Obj class.
3. A companion object and its class can access each other’s private members (fields and methods)
4. when you have a class with same name as singleton object, it is called companion class and the singleton object is called companion object.
6. The companion class and its companion object both must be defined in the same source file.
 */
class CompanionObject{
  def hello(){
    println("Hello, this is Companion Class.")
  }
}
object CompanionObject {
  def main(args:Array[String]){
    new CompanionObject().hello()
    println("And this is Companion Object.")
  }
}
