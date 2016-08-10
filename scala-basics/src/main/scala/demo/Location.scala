package demo

/**
 * Classes in Scala are static templates that can be instantiated into many objects at runtime. 
 * 
 * Created by hdhamee on 7/12/16.
 */
class Location(val xc: Int, val yc: Int,val zc :Int) extends Point(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }
}
