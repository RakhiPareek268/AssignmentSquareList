package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class SquareTest extends AnyFlatSpec {
  val obj=new SquareList
  val list=List(6,9,2)
  "condition"should "square the each element of list(2,3,4,5)"in{
    val temp=List(2,3,4,5)
    assert(obj.squareList(temp)==List(4,9,16,25))
  }
  "condition"should "return the Empty list as our input list is empty" in{
    val temp=List()
    assert(obj.squareList(temp)==List())
  }
  "condition" should "check that both equivalent functions should return same result" in{
    assert(obj.squareList(list)==obj.squareListMap(list))

  }

}
