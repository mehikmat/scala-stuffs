package demo

object Composition {

	def main(args: Array[String]):Unit = {
			println("Composition Example: New operator creation, so scala is scalable")
			val a = new Digit(5)
			val b = new Digit(3)
			val sum = a + b
			print(sum)
	}

	class Digit(a:Int){

		def get() = {
			this.a
		}

		def +(b:Digit) = {
			if(this.a > 0){
				this.a + b.get()
			}
		}
	}
}