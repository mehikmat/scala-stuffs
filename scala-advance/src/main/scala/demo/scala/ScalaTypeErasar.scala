package demo.scala

import scala.reflect.ClassTag

/**
  * Created by hdhamee on 1/31/17.
  */
object ScalaTypeErasar {

  def main(args: Array[String]) {
    val array = createArray[Double](5)
    val arraySame = createSameArray[Double](5)

    println(array.mkString(","))
    println(arraySame.mkString(","))
  }

  def createArray [A](length: Int) (implicit tag:ClassTag[A]) = new Array[A](length)

  // short-cut way
  def createSameArray [A: ClassTag](length: Int) = new Array[A](length)

}
