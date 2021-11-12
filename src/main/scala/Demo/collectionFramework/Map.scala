package Demo.collectionFramework

/*
We can create elements using rocket operator(->) and by using (,) operator.
map is mutable and immutable Map classes.
 */
class Map {
}
object obj{
  def main(args:Array[String]): Unit ={

var map = Map(("A","Apple"), ("B", "Ball")) // creating a map using ","
var map2 = Map("A" -> "Apple", "O" -> "One")//creating a map using "->"
println("Map:-" + map)
    println("Accessing elements by kye :-" + map("B"))
    println("Adding new elements into list :- " + map +("C" -> "Cat"))// we can also add multiple elements in same way.
//    map -= List("A") // for removing one element from map
    map2 --= List("A") // for removing two element from map
    println("Removing the element :- " + map2 )
    println(map2)


    /*
    HashMAp :- HashMap is used to store element. It use hash code to store elements and return a map.
     */


  }
}
