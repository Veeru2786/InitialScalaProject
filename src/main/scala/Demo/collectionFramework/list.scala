package Demo.collectionFramework

import scala.:+
/*
1.It can also contain duplicate elements and maintain order of element. It is immutable.
2. Used to store ordered elements.
3. We can also merge of two Lists.
4. We never do modification in list.
 */
class list {

}
object  objs{
  def main(array: Array[String]): Unit ={
    var list =List(9,2,3,1)// we can also add different type of data in list.
    println("List :- " + list)// print list
    println("accessing elements:- " + list(2)) // print particular elements form list.
    println("Sorted List:- " + list.sorted) // sorted list
    println("removing first two elements from list:- "+ list drop 2)// by this removed first 2 elements from list. we never have to use . operator in scala we just like simple language as well.
    println("reverse the list:- " + list.reverse) // reverse the list, new list wil created of reversing elements instead of changing in original list
    println("Adding a new element in list:- " )
    /*
    List is immutable so we can't adding element into list so for that we want to create new list by appending elements to an existing list.
    If we want to prepend and append elements to an immutable sequence, use vector instead.
    list will never used where we have large number of elements.

        */

    val newElements =list  :+  7// adding one new element in end of the list
    val newElemen =5  +:  list// adding one new element in starting of the list
    val newElement = List(-1, 2) ++: list// adding two new element in list
    println("adding one new element in end of the list :- " + newElements)
    println(" adding one new element in starting of the list :- " + newElemen)
    println("adding two new elements into list :- " + newElement)
  }
}
