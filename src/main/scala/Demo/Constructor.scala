package Demo

/*
1. Scala provides primary and any number of (Secondary) auxiliary constructors.
2. if we never specify primary constructor, compiler creates a one constructor which is known as primary constructor.
3. We can create primary constructor with zero or more parameters.
4. Some rules:
  - Each auxiliary constructor must have a different signature
  - Each constructor must call one of the previously defined constructors
5.  constructor is not special method.
6. All the statements of class body treated as part of constructor.
 */

class Constructor(id:Int, name:String){
  var age:Int = 0
  def showDetails(){
    println(id+" "+name+" "+age)
  }
  def this(id:Int, name:String,age:Int){
    this(id,name)       // Calling primary constructor, and it is first line
    this.age = age
  }
}

object abc{
  def main(args:Array[String]){
    var s = new Constructor(101,"Veeru",21);
    s.showDetails()
  }
}
