package Demo

/*
1. its also known as syntactic sugar.By this our code get simple and shorter.
2. We use underscore in match expression case for default case.
3. for importing all the members of the particular package.
 */
object useOfUnderscore_ {
  var x: String =_ //When the initial value of a variable is not necessary, we can use the underscore as default:
  def getLength(x : List[List[_]]) :Int = x.length // With _, we allowed all types of elements in the inner list.

  def  main(array: Array[String]): Unit ={
    x = "value"
    println(x)

  }

}
