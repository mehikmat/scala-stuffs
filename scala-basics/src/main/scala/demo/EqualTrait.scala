package demo

/**
 * Similar to interfaces in Java, traits are used to define object types by specifying
 * the signature of the supported methods. Like in Java 8, Scala allows traits to be partially implemented;
 * i.e. it is possible to define default implementations for some methods.
 * In contrast to classes, traits may not have constructor parameters.
 * 
 * Once a trait is defined, it can be mixed in to a class using either the
 * extends or with keywords. Scala programmers “mix in” traits rather than
 * inherit from them, because mixing in a trait has important differences from
 * the multiple inheritance found in many other language.
 * 
 * More----
 * 
 * [1] if the behavior will not be reused, then make it a concrete class. It is not reusable behavior after all.
 * [2] If it might be reused in multiple, unrelated classes, make it a trait. Only traits can be mixed into different parts of the class hierarchy.
 * [3] If you want to inherit from it in Java code, use an abstract class.
 * 
 * Created by hdhamee on 7/12/16.
 */
trait EqualTrait {
  def isEqual(x: Any): Boolean // need to be implemented by extending class
  def isNotEqual(x: Any): Boolean = !isEqual(x) // no need to implement
}

