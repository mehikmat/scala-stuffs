package demo
/**
 * [1] Using the modifier 'case' in front of class makes the Scala compiler add some syntactic conveniences to your class.
 * [2] The second syntactic convenience is that all arguments in the parameter list of a case class implicitly get a val prefix.
 * 
 * To construct an instance of case class, can be used ClassName("x") instead of the slightly longer new ClassName("x") :
 * 
 */
case object CaseObject {
	def main(args:Array[String]):Unit = {
			println("case object")
			val a = CaseClass("Hi")
			a.welcome()
	}
}

case class CaseClass(a:String) {
	def welcome(){
		println("case class " + a)
	}	
}