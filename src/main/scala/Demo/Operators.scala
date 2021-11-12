package Demo

/*
1. operators are methods.
2. Any method with a single parameter can be used as an infix operator.
3. You can use any legal identifier as an operator. This includes a name like add or a symbol(s) like +.
 */

  case class Operators(x: Double, y: Double) {

      def +(that: Operators) = Operators(this.x + that.x, this.y + that.y)

  val vector1 = Operators(1.0, 1.0)
  val vector2 = Operators(2.0, 2.0)
  val vector3 = vector1 + vector2
  vector3.x  // 3.0
  vector3.y  // 3.0
  }

/*
Other Example,
 */
case class myBool(a: Boolean) {

  def and(that: myBool): myBool = if (a) that else this
  def or(that: myBool): myBool = if (a) this else that
  def negate: myBool = myBool(!a)

  /*
now we can use And and Or operator as infix operators:-  like,
 */

  def not(x: myBool) = x.negate
  def xor(x: myBool, y: myBool) = (x or y) and not(x and y)
}



// Demmo:-
object o1{
  case class Student(var name: String ="demo", var marks: Int = 100){
    def >(s2:Student) : Boolean = marks > s2.marks
  }
  def main(args:Array[String]): Unit ={
    var s2 = Student("veeru", 90);
    var s1 = Student();
    println("Answer:- " + s1.>(s2)) //s1 is object "." is operator and s2 is parameter and > is function name

  }
}