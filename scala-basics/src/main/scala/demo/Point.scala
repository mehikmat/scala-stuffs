package demo

/**
 * Created by hdhamee on 7/12/16.
 */
class Point(xc: Int, yc: Int) extends Equal{
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x);
    println ("Point y location : " + y);
  }

  def isEqual(obj: Any) = {
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x && obj.asInstanceOf[Point].y == y
  }
}

