package Demo

/*
1. You can apply accessibly to classes, traits, data members, member methods and constructors etc.
2. No modifier, Protected, Private
2. By default No modifier.
 */

class AccessModifiers {

  private  var a:Int =10
  def show(): Unit ={
    println(a)
  }
}

object MainObject{

  def main (args: Array[String]): Unit ={
    val accessModifiers =  new AccessModifiers()
    accessModifiers.show()

  }
}

