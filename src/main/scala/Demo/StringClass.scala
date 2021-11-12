package Demo

/*
1. We can meagre string in scala as well.
 */

class StringClass {

}
object o3{

  def main(args: Array[String]): Unit ={

    var fistName = "Veeru"
    var lastName = "Garg"
    println(s" $fistName $lastName")
    println(s"${fistName} ${lastName}")

    var string =
      """hello
        |xenonstack
        |company
        |""".stripMargin// we can also create string in multiple lines using """.

  }
}
