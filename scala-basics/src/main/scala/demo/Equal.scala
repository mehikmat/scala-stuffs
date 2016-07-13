package demo

/**
 * Created by hdhamee on 7/12/16.
 */
trait Equal {
  def isEqual(x: Any): Boolean // need to be implemented by extending class
  def isNotEqual(x: Any): Boolean = !isEqual(x) // no need to implement
}

