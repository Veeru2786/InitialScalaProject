package Demo.collectionFramework

import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.collection.immutable._

/*
1. Collection are mutable or immutable in scala.
2. immutable collections. It does not allow you to modify data. Scala imports this package by default.
 */

class Set {

}
object ob1{

  def main(args: Array[String]){

    /*
 SET.....
1. Set are used for store the unique elements in the set, without any order and we can apply different types of operations on set.
2. We can create empty set as well(emptySet1)
3. We can also merge two sets in single set. for that scala provide predefined method
4.  it does not allow duplicate.
5. we can adding elements by the these ways:- += , ++==, add
 */
    val emptySet1 = Set() // empty set
    val normalSet = Set("Set1", "Set2", "Set3")
    println("Empty Set :- " + emptySet1 + "  "  + "Normal Set :-"  + normalSet)

    var MergeSet1 = Set("Ones")
    var MergeSet2 = Set("One")
    var mergeSet = MergeSet1 ++ MergeSet2
    println("Merge Set:- " + mergeSet)
    println("Elements is present or not :- " + normalSet.contains("Set1")) //We can also check weather the element is present in set or not by contain method.
    println("Size of Set:- " + normalSet.size)
    var newSet = Set("tom and jerry", "doremon")
    newSet +="bheem"
    println("Adding new Elenment in Set:- " + newSet)// Adding new Element in set
    newSet -= "tom and jerry"
    println("Removing new Elenment in Set:- " + newSet)// Removing element from set
    //we can do iterating as well using for each loop:-
    normalSet.foreach((element: String) => println("Iterating set :- " + element))

// we can also perform opration like intersection and union.
    var games = Set("Cricket","Football","Hocky","Golf","C")
    var alphabet = Set("A","B","C","D","E","Golf")
    var setIntersection = games.intersect(alphabet)
    println("Intersection by using intersect method: "+setIntersection)
    println("Intersection by using & operator: "+(games & alphabet))
    var setUnion = games.union(alphabet)
    println(setUnion)

    // we used sortdSet for stored the integers elements in set it will return the sorted set. We will sort string element as well.
    var numbers:SortedSet[Int] = SortedSet(4,2,5,1,9,7)
    println("Sorted integer elements:- "+  numbers)


    /*
    HashSet:-
    1. It extend the abstractSet and immutable set trait. It use the hash code for store the elements.
    2. It will never maintains insertion order and sorts the element.
    3. We will create the element for store the elements.
         */

    var hashSet = HashSet(5,3,6,1,7)
    hashSet.foreach((element:Int)=> println(element+" " ))

    /*
    BitSet is set of positive integer which is used for represented as variable size arrays of bits.
    The memory is determined by largest number present in set.
     */
    var bitSet = BitSet(1,6,8,3,7,9)
    bitSet.foreach((ele:Int)=>println("BitSet Elements:- " + ele))

    /*
    ListSet:-
    1.list is implements immutable sets using a list-based data structure..
    2. Elements are stored in the reversed order , that's why newest element is at the head of the list and it also maintains insertion order.
    3. We are only used this when we have small number of elements .
    4. By calling the constructor and applying the function of list we can create the empty list
     */

    var listSet= List(2,1,4,3)
    listSet.foreach((e1:Int) => "List Set:- " + e1)


    /*
    Scala Seq:-
    1. It represent the indexed sequence that are immutable. we can access the elements by using the index and also maintains insertion order elements.
    2. Seq support methods for check the occurrences of elements and it also maintain the insertion order.
    3.We can also access the elements in reverse order by using reverse method.
     */

    var seq:Seq[Int] = Seq(44,67657,1313,886)
    seq.foreach((e2:Int) => println("Sequence elements:- " + e2))
    println("Accessing the element by index values:- " + seq(2))
  }
}