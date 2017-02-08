package demo.scala

import scala.collection.mutable.ArrayBuffer

/**
  * @author ${user.name}
  */
object ScalaCollection {

  def main(args : Array[String]) {

    /**
      *
      * Both Array and ArrayBuffer are mutable, which means that you can modify elements at particular indexes: a(i) = e
      * ArrayBuffer is resizable, Array isn't. If you append an element to an ArrayBuffer, it gets larger.
      *
      * If you try to append an element to an Array, you get a new array. Therefore to use Arrays efficiently,
      * you must know its size beforehand.
      *
      */

    // using ArrayBuffer object
    val names = ArrayBuffer[String]("Hikmat","Rame","Shyam");
    names.prepend("FirstElm")
    names.append("LastElm")
    names.insert(1,"Krishna") // insert krishna at position 1 and reorder elms
    names.remove(1) // removes value at position 1 and reorder elms
    names(1) = "HikmatReplaced"
    println(names.mkString(",\t"))

    // using ArrayBuffer class
    val namesCls = new ArrayBuffer[String]()
    namesCls.append("FirstElm")
    println(namesCls.mkString(",\t"))

    //using Array class and Array object
    val nameAObj = Array[String]("Hikmat","Ram")
    val nameACls = new Array[String](2)
    nameACls(1) = "Rame"
    println((nameACls ++ nameAObj).mkString(","))

    // Collection shuffling or randomization
    val shuffledList = scala.util.Random.shuffle(List(1,2,3,4))
    println(shuffledList.mkString(",\t"))

  }

}
