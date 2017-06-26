package demo.scala

/**
  * Created by hdhamee on 6/26/17.
  */
object DefaultParameterAndNamedArgument {

  def main(args: Array[String]) {
     println(fullName("Hikmat "," Dhamee","Singh"))
     println(fullName("Hikmat "," Dhamee"))

    // named arguments
    println(fullName(lname = " Dhamee", fname =  "Hikmat "))
  }

  // Here `mname` is default parameter, if not supplied, it uses a '-' as it's value
  def fullName(fname:String,lname:String,mname:String = "-"): String = {
    fname + mname +lname
  }

}
