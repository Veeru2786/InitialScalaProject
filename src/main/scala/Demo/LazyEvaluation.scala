package Demo

/*
1. it is evaluation strategy which laze the evaluation of the expression until its value is needed
2. till we are not using lazy
 */
class LazyEvaluation() {
  val e = {
    println("strict")
    9
  }
}
class LazyEval() {
  lazy val l = {
    println("lazy")
    9
  }
}
object o6{
  def main(args: Array[String]): Unit ={
    val x = new LazyEvaluation
    val y = new LazyEval
    println(x.e)// if i comment these both println then only strict will print because we never use lazy variable any where.
    println(y.l)
  }
}