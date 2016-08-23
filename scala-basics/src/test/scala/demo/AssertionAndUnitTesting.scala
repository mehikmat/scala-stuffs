package demo
import org.scalatest.Suite

class AssertionAndUnitTesting extends Suite {
	/**
	 * The assert method is defined in the Predef singleton object, whose members are
	 * automatically imported into every Scala source file.
	 * 
	 * Scala Provides ScalaTest for tesing
	 * 
	 * Each test method starts with test*
	 * 
	 * ./sbt test --- to run tests
	 */

	def testEnsuring():Int = {
			5 + 5       
	} ensuring( 3 > _ ,"Assertion failed in Ensuring")

	def testUniformElement() {
		    val a = 5
				val b = 6		
				assert(a!=b)
	}
}