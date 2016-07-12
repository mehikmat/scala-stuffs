package demo
import demo.Run._

object HelloWorld {

  def main(args: Array[String]) = {

    var myVar :Int = 10 // variable/mutable declaration
    val myVal :String = "Hello Scala with datatype declaration." // constant/immutable declaration
    println(myVar); println(myVal)
    println(">>>>>>>>>>>>>>>>>>>>>>>>>")

    //using base class
    val point = new Point(2,3)
    point.move(2,3)
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    //using extended class
    val location = new Location(2,3,4)
    location.move(2,3,4)
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    // implicit class test
    4 times println("hello")
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    // closure test
    val multiplier = (i:Int) => i * 10
    val mul:Int = multiplier(5)
    println(mul)
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    // string test
    val fs = printf("The value of the float variable is " +
      "%f, while the value of the integer " +
      "variable is %d, and the string " +
      "is %s",0.5, 10, "SECOND")
      println(fs)
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    // array test
    var myList = Array(1.9, 2.9, 3.4, 3.5)
    for(x <- myList){
      print(x)
    }
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>")




  }
}
