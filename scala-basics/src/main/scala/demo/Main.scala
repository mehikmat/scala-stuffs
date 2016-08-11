package demo

import java.io.{FileNotFoundException, FileReader, IOException}
import scala.util.control.Breaks._
import scala.io.Source

/**
 *  The `App` trait can be used to quickly turn objects into executable programs.
 *  Here is an example: Here, object `Main` inherits the `main` method of `App`.
 *  
 *  =========== All operations are method calls in Scala.=======================
 *  
 *  To run a Scala program, you must supply the name of a standalone singleton
 *  object with a main method that takes one parameter, an Array[String] ,
 *  and has a result type of Unit . Any standalone object with a main method of
 *  the proper signature can be used as the entry point into an application
 */
object Main extends App {
	Console.println("Hello World: " + (args mkString ", "))

	// Array: mutable both in java and scala
	val greetStrings = new Array[String](3)
	greetStrings(0) = "Hikmat"
	greetStrings(1) = ", "
	greetStrings(2) = "Dhamee!\n" // transformed to greetStrings.update(2,"Dhamee!)
	for (i <- 0 to 2) print(greetStrings(i))

	// Scala infers type as String as we passed Strings
	val numNames = Array("zero", "one", "two")
	numNames.foreach(x => println(x))

	//(1).+(2): calling a method + on an object 1 passing 2 as method parameter
	val sum = 1 + 2
	var su = 1.+(2)
	println(sum,su)

	//Lists:immutable in Scala
	val oneTwo = List(1, 2)
	val threeFour = List(3, 4)
	val oneTwoThreeFour = oneTwo ::: threeFour //::: is concatenation operation
	println(oneTwo +" and "+ threeFour +" were not mutated.")
	println("Thus, "+ oneTwoThreeFour +" is a new list.")

	val twoThree = List(2, 3) 
	val oneTwoThree = 1 :: twoThree // :: operator prepends the element at the begaining of list, :: is a method of its right operand
	println(oneTwoThree)

	// Tuple: immutable in scala
	val pair = (99, "Luftballons")
	println(pair._1)
	println(pair._2)

	//Sets and Map: Both mutalbe and immutable version exits in scala
	var jetSet = Set("Boeing", "Airbus")
	jetSet += "Lear"
	println(jetSet.contains("Cessna"))	

	var capital = Map("US" -> "Washington", "France" -> "Paris")
	capital += ("Japan" -> "Tokyo")
	println(capital("France"))



	// Functional Coding VS Imperative coding
	/**
	   If the code contains no vars at all—i.e., it contains
     only vals—it is probably in a functional style. One way to move towards a
     functional style, therefore, is to try to program without vars.

      If you’re coming from an imperative background, such as Java, C++, or
      C#, you may think of var as a regular variable and val as a special kind of
      variable. On the other hand, if you’re coming from a functional background,
      such as Haskell, OCaml, or Erlang, you might think of val as a regular vari-
      able and var as akin to blasphemy.
	 */

	// multiline string and to strip blank margins. vertical bar is used to separate margine
	/**
	 println("""|Welcome to Ultamix 3000.

			|Type "HELP" for help.""".stripMargin)

	 */


	/**
	 One difference from Java that you’ll quickly notice in Scala is that unlike
Java, Scala does not require you to catch checked exceptions, or declare
them in a throws clause. You can declare a throws clause if you wish with
the @throws annotation, but it is not required.
	 */
	var f:FileReader = null
	try{
		f = new FileReader("test.txt")
	}catch{
	case ioex:FileNotFoundException => println("File not found: " + ioex.toString())
	case ex:IOException => println("IO exception")
	case _:Throwable => println("Other")

	}finally {
		if(f != null){
			f.close()	
		}

		/**
		 * In Scala, match works like switch case, and can return a yield like below.
		 */
		val friend = "other" match {
		case "salt" => "pepper"
		case "chips" => "salsa"
		case "eggs" => "bacon"
		case _ => "huh?"
		}
		print(friend)
		// Be sure to close the file
	}
	/**
	 * No Break and Continue in scala
	 * 
	 * The simplest approach is to replace every continue by an if and every break by a boolean variable.
	 *  The boolean variable indicates whether the enclosing while loop should continue.
	 */
	// if BTW if we need to use break, use this way
	breakable {
		while (true) {
			println("? ")
			if (1!=2) break
		}
	}

	/**
	 * yield adds the yield of each iteration to a list same as input type and returns when loop finishes.
	 */
	val a = makeRowSeq(2)

			println("ROW: " + a)

			// Returns a row as a sequence
			def makeRowSeq(row: Int) = 
			for (col <- 1 to 10) yield {
				val prod = (row * col)
						prod						
			}
	/**
	 * Functions ==================================
	 */
	//-[1] Method functions The most common way to define a function is as a member of some object.
	def processFile(filename: String, width: Int) {
		val source = Source.fromFile(filename)
				for (line <- source.getLines())
					processLine(filename, width, line)
	}
	private def processLine(filename: String,width: Int, line: String) {
		if (line.length > width)
			println("From Function: " + filename +": "+ line.trim)
	}
	processFile("sbt", 20) 
	//or
	Main.processFile("sbt", 20)

	//[2] Local Functions: Function can be within function which is called local function
	def processFile1(filename: String, width: Int) {
		val source = Source.fromFile(filename)
				for (line <- source.getLines()){
					processLineLocal(filename, width, line)
				}
		def processLineLocal(filename: String,width: Int, line: String) {
			if (line.length > width)
				println("From Local: " + filename +": "+ line.trim)
		}
	}
	processFile1("sbt", 20)   
	//[3] First class functions
	var increase = (x: Int) => x + 1// function defined as unnamed literal
	println(increase(10)) // function acting as function
	println(increase.apply(2)) // function acting as object

	//[4] Partially applied function use _ as place holder for argument
	//A partially applied function is an expression in which you don’t supply all of the arguments needed by the function.
	def add(a: Int, b: Int, c: Int) = a + b + c
	add(1, 2, 3)
	val af = add _  // creates a function with apply method that takes 3 missing arguments and calls add method
	af(1, 2, 3)
	val bf = add(1, _: Int, 3) // creates a function class with apply method that takes 1 missing arguments and call add with 3 params
	bf(2)

	/**
	 *  Closures ======================================== *  
	 *  
	 */
	// function literal inr, x is bound var and ab is free var for this literal	
	val ab:Int = 10  
	/*The function value (the object) that’s created at runtime from this function
literal is called a closure. The name arises from the act of “closing” the func-
tion literal by “capturing” the bindings of its free variables.*/
	var inr = (x: Int) => x + ab
	println(inr(10))

	// Function can be called with named parameter and also can be defined default values, multiple args


	/**
	 * Control Abstraction
	 */

	/**
	 * Scala Composition === see in Composition class
	 */

	/**
	 * Scala Hierarchy
	 * - In Scala, every class inherits from a common superclass named Any.
	 * - just as Any is a superclass of every other class, Nothing/Null is a subclass of every other class.
	 *
	 *
	 *                       scala.Any
	 *                          |
	 *    -----------------------------------------
	 *    |                     |                  |
	 *    scala.AnyVal      scala.AnyRef     scala.ScalaObject
	 *    (Int,Double etc)    (String,etc)     (Iterator,Seq,etc)
	 */       
}
