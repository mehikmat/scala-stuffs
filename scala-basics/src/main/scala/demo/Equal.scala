package demo

/**
 * Similar to interfaces in Java, traits are used to define object types by specifying
 * the signature of the supported methods. Like in Java 8, Scala allows traits to be partially implemented;
 * i.e. it is possible to define default implementations for some methods.
 * In contrast to classes, traits may not have constructor parameters.
 * 
 * Created by hdhamee on 7/12/16.
 */
trait Equal {
  def isEqual(x: Any): Boolean // need to be implemented by extending class
  def isNotEqual(x: Any): Boolean = !isEqual(x) // no need to implement
}

