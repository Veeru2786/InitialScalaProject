package Demo

/*
1. This object is declared by using object keyword instead by class.
2. We can call methods without creating any object jede method singletone object ch decalred kite ne.
4. In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.
If you don't create singleton object, your code will compile successfully but will not produce any output.
5. Methods declared inside Singleton Object are accessible globally. A singleton object can extend classes and traits.
6. A singleton object can extend classes and traits.


 */
object SingleToneObject {
def main(args:Array[String]){
  SingleTonObj.hello// No need to create object.
}
}
object SingleTonObj{
  def hello: Unit ={
    println("hello")
  }
}
