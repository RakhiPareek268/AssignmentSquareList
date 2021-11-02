package edu.knoldus

class SquareList {
  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case List() => List()
      case y :: ys =>y * y :: squareList(ys)
    }

  def squareListMap(xs: List[Int]): List[Int] = {
    xs map(elem=> elem * elem)
  }

}
object main{
  def main(args: Array[String]): Unit = {
    val obj=new SquareList
    val xs=List(1,2,4,5)
    println(obj.squareList(xs))
    println(obj.squareListMap(xs))
  }
}
