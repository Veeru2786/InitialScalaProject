package Demo

/*
1. Classes are basically blueprint for creating object , it can contain methods, values, variables, types, objects, traits, and classes which are collectively called members.
2. Class is collection of objects of similar type.
3. There is no default scope. If you don't specify access scope, it is public.
 */
class Classes{
  var id:Int = 0; //All fields must be initialized otherwise we want to make class as abstract.
  var name:String = null;
}
object Main{
  def main(args:Array[String]): Unit = {
    var s = new Classes()  // Creating an object
    println(s.id+" "+s.name);
  }
}

/*
4. we can also create class with constructor as well
5. It contain the Data Members, Member Me,ber methods, constructor, Block , Nested class etc.
 */

class Student(id:Int, name:String){// Primary constructor
  def show(): Unit = {
    println(id + " " + name)
  }
}
object main{

  def main(args:Array[String]): Unit = {

    var string = new Student(100,"Veeru")// Passing values to constructor
    string.show()  // Calling a function by using an object

  }
}



