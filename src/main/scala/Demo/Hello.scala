package Demo

object Hello {
  def main(args: Array[String]): Unit ={ //Method main take the args as input parameter.
    println("Hello Word")
  }
}
/*
1. Here we can define method name as main inside  the object named Hello.
2. There must be an object in which main method is defined. It provides starting point for your program. Because main methods
3. Object is a class that has exactly one instance.
 */

object Demo{
  def info(msg: String) = println(msg) // Now we import this info method anywhere in the program. Like i use this method in Blocks Class within Info Class.
}

