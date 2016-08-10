package demo

import java.io.{FileNotFoundException, File, PrintWriter, FileReader, IOException}

import demo.Run._

import scala.io.Source

/**
 *  Scala is more object-oriented than Java because in Scala, we cannot have static members.
 *  Instead, Scala has singleton objects. A singleton is a class that can have only one instance,
 *  i.e., Object. You create singleton using the keyword object instead of class keyword.
 *  Since we can't instantiate a singleton object, we can't pass parameters to the primary constructor. 
 */
object HelloWorld {

  def main(args: Array[String]) = {
    val myVar :Int = 10 // variable/mutable declaration
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
    println()
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    // trait test
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 3)
    println(p1.isEqual(p2))
    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(2))
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    // pattern matching
    println(matchTest("d"))

  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

  //Exception test
  //Checked Exception: checked at compile time by compiler and throws error if not handled or declared at method signature
  //Unchecked Exception: Not checked by compiler at compile time. Eg. Runtime Exceptions

  try {
    val f = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException => {
      println("Missing file exception")
    }

    case ex: IOException => {
      println("IO Exception")
    }
  } finally {
    println("Exiting finally...")
  }
  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")


  // Extractor test


  // File I/O test
  // using java classes
  val writer = new PrintWriter(new File("Test.txt" ))
  writer.write("Hello Scala")
  writer.close()
  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

  //using scala
  print("Please enter your input : " )
  val line = Console.readLine()
  println("Thanks, you just typed: " + line)
  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")


  println("Following is the content read:" )
  Source.fromFile("Test.text" ).foreach {print};println
  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
  
  

}
