package Demo.collectionFramework

/*
1. Vector is immutable DS which provides the random access of elements, its good for large collection of elements.
2. It extends AbstractSeq and IndexedSeq.
 */
class Vector {

}
object obj1{
  def main(args:Array[String]){
    var vector1:scala.Vector[Int] = Vector(1, 5,6,2,8,3)
    println("Vector Output:- " + vector1)

    /*
     We can also created new elements in vector and also do merge two vector.

      */
    var vector2: scala.Vector[Int] = Vector(8,4,6)
    var mergeingTwoElement = vector1 ++ vector2
    println("Merging two Vectors:- " + mergeingTwoElement)
  }

}
