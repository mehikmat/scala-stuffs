package demo

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

	// Functional Coding vs Imperative coding
	/* If the code contains no vars at all—i.e., it contains
     only vals—it is probably in a functional style. One way to move towards a
     functional style, therefore, is to try to program without vars.

      If you’re coming from an imperative background, such as Java, C++, or
      C#, you may think of var as a regular variable and val as a special kind of
      variable. On the other hand, if you’re coming from a functional background,
      such as Haskell, OCaml, or Erlang, you might think of val as a regular vari-
      able and var as akin to blasphemy.
	 */

	// multiline string and to strip blank margins. vertical bar is used to separate margine
	println("""|Welcome to Ultamix 3000.
			|Type "HELP" for help.""".stripMargin)



}