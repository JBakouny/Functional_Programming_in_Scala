import org.scalatest.FunSuite

import Task._

class TestSpec extends FunSuite {

  test("Testing the sumInt function") {
    assert(sumInt(5, 10) == 45, "SumInt impl is incorrect")
  }

  test("Testing the sumInt function for big numbers") {
    assert(sumInt(5, 100000) == 705082694, "SumInt impl is incorrect")
  }

  test("Testing the sumCube function") {
    assert(sumCube(5, 10) == 2925, "sumCube impl is incorrect")
  }

  test("Testing the fact function") {
    assert(fact(5) == 120, "fact impl is incorrect")
  }

  test("Testing the sumFact function") {
    assert(sumFact(5, 10) == 4037880, "sumFact impl is incorrect")
  }

  test("Testing the product function") {
    assert(product(x => x * x)(5, 10) == 1386603520, "product impl is incorrect")
  }
}
