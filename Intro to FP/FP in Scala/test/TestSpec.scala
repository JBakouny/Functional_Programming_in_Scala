import org.scalatest.FunSuite

import Task._

class TestSpec extends FunSuite {

  test("Testing the sumInts function") {
    assert(sumInt(5, 10) == 45, "SumInt impl is incorrect")
  }

  test("Testing the sumCube function") {
    assert(sumCube(5, 10) == 2925, "sumCube impl is incorrect")
  }

  test("Testing the sumFact function") {
    assert(sumFact(5, 10) == 4037880, "sumFact impl is incorrect")
  }
}
