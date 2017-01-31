package demo.scala

/**
  *
  * implicit parameters:
  *   Implicit parameters are simple. If you declare a function parameter as implicit, the callers of your
  *   function will be able to avoid passing this parameter provided that they have an eligible value of a
  *   compatible type marked as implicit.
  *
  * implicit conversions
  *
  */
object ScalaImplicit {


  /**
    * Implicit parameters
    *
    */

  class Person(val name: String){}

  implicit val person: Person = new Person("Hikmat_Dhamee")

  def sayHello(implicit person: Person): String = s"Hello ${person.name}"

  def sayHi(implicit name: String): String = s"Hello $name"


  /**
    * Implicit Conversion
    *
    */
  case class People(name: String) {
    def treat: String = s"Hello! I'm $name"
  }

  object People {
    implicit def stringToPerson(str: String): People = People(str)
  }


  def main(args: Array[String]) {

    val name = sayHello(person)
    println(name)
    val imName = sayHello
    println(imName)

    // implicit call
    implicit val iName = "Hiku"
    println(sayHi)

    //Implicit conversion
    import People.stringToPerson
    val msg = "Santosh".treat
    println(msg)

  }

}
