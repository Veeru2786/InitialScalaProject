package Demo

/*
1. used to share interfaces and fields between classes.
2. Classes and objects can extend traits, but traits cannot be instantiated and therefore have no parameters.
3. trait are a collection of abstract and non-abstract methods.
4. Traits are compiled into Java interfaces with corresponding implementation classes that hold any methods implemented in the traits.
5. A variable that is declared either by using val or var keyword in a trait get internally implemented in the class that implements the trait.
6. Any variable which is declared by using val or var but not initialized is considered abstract.
7. If extended trait class doesn't implement method of Trait then that class must be declare as abstract.
8. traits and abstract both similar but the difference is We never extend multiple abstract class but we can extend multiple traits .
9. Use extend keyword for extend first trait and use With keyword for extend subsequent traits.
10.Whe we have to use constructor parameter then we create abstract class because traits doesn't have option to use constructor parameter.Like,
           trait Animal(name: String)
 */
trait Traits {
  def show()
}

class Abc extends Traits {
  def show() {
    println("My first trait")
  }
}

object Object{
  def main(args : Array[String]): Unit ={
    var a = new Abc
    a.show()
  }
}

/*
Scala Trait Mixins:- means you can extend any number of traits with a class or abstract class.
first we have to extend class then we traits.
 */