package demo.scala

/**
  * Created by hdhamee on 2/8/17.
  */
object ScalaTypeClasses {

  //[1] a type class interface with one or several methods
  trait InfoPrinter[T] {

    def toInfo(value: T): String

  }

  //[2]several concrete type class instances (all marked as implicit)
  object DefaultInfoPrinters {
    // We’re putting everything inside the object for convenience.

    implicit val stringPrinter = new InfoPrinter[String] {
      override def toInfo(value: String): String = s"[String] $value"
    }

    implicit val intPrinter = new InfoPrinter[Int] {
      override def toInfo(value: Int): String = s"[Int] $value"
    }
  }

  //[3] an implicit conversion containing the printInfo() method
  object PrintInfoSyntax {

    implicit class PrintInfoOps[T](value: T) {

      def printInfo()(implicit printer: InfoPrinter[T]): Unit = {
        println(printer.toInfo(value))

      }
    }
  }



  def main(args: Array[String]) {
    import DefaultInfoPrinters._
    import PrintInfoSyntax._

    val number = 42
    number.printInfo() // prints "[Int] 42"

    /*
    When users define a custom type A, all they need to do is write an InfoPrinter[A] implementation
    and mark it implicit. If they put this implicit value inside the companion object, it will be
    automatically available due to implicit resolution rules:

     */
  }

}
