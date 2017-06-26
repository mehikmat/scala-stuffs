package demo.scala

/**
  * Created by hdhamee on 6/26/17.
  *
  * if an object has same name as a class and resides in the same file as class, then it's call companion object.
  *
  * This is more or less  a design pattern, so that static methods,fields which doesn't relate to a specific instacne of class
  * then such things can be put into an companion object.
  *
  * All the private things of an object can be accessed from companion class.
  *
  */
object CompanionObject {
  private val message:String = "Hello I am Companion Objct Object"
}

class CompanionObject(message:String =  CompanionObject.message) {
  println(message)
}
