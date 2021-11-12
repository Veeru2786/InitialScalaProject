package Demo.collectionFramework

/*

1. We can apply These three methods on collection, we can use these methods to apply binary operation on each element of a collection and result of each step will passing to next step and produce one single value as result.
2. reduce vs fold:- in fold we will add starting value, but in reduce  can't
3. fold vs scan :- in both we add starting value but difference is that san will give the map as result.

 */
object Reduce_Fold_San {
  def main(args:Array[String]): Unit ={
    val lst = List(1,2,3,4)
    val lst1 = List("A", "B", "C", "D")

    println(lst.reduceLeft(_+_))
    println(lst1.reduceLeft(_+_))
    println(lst.reduceLeft((x,y)=> {println(s"$x , $y"); x+y;}))

    println(lst.reduceLeft(_-_))
    println(lst.reduceRight(_-_))
    println(lst.reduceRight((x,y) => {println(s"$x , $y"); x + y;}))

    println(lst.foldLeft(100)(_+_))
    println(lst1.foldLeft("z")(_+_))

    println(lst.scanLeft(100)(_+_))
    println(lst1.scanLeft("z")(_+_))

  }
}