package Demo

/* 1.Tuples are not a collection because it never have  methods map , filters , this is container where we store different different  item in same container.
2. we just need to put some elements inside parentheses, and you have a tuple. Scala tuples can contain between two and 22 items, and they’re useful for those times when you just need to combine a few things together
3.If there is no element present, it is called empty tuple.

 */
object Tuples {
  def main(args: Array[String]): Unit =
  {
    var tuple1 = (1,2,3)//integer typed tuple.
    var tuple2 = ("One", "two")// string type tuple.
    var tuple3= (1,2.2,"string")
    println(tuple1)
    println(tuple2)
    println(tuple3)

    println(tuple1._1)// accessing the elements of tuple by using index.
    println(tuple3.productIterator.foreach(print))// iterating the tuple


    /*
     There is other way to accessing the elements is:-
     */
    val(x,y,z) = (1,"veeru",1.1)// by variable accessing the elements.
    println(x)
  }
}

