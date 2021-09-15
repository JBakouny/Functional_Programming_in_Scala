import org.scalatest.FunSuite
import scala.math.abs
import FirstSqrtImpl.sqrt

class TestSpec extends FunSuite {

  def equals(x: Double, y : Double) : Boolean =
    abs((y - x) / x) < 0.001

  def testSqrt(x : Double): Unit = {
    val y = sqrt(x)
    assert(equals(y * y, x), "Sqrt result is incorrect")
  }

  test("Test Sqrt 2") {
    testSqrt(2)
  }
  test("Test Sqrt 4") {
    testSqrt(4)
  }

  test("Test Sqrt 1e-6") {
    testSqrt(1e-6)
  }

  test("Test Sqrt 1e20") {
    testSqrt(1e20)
  }

  test("Test Sqrt 1e50") {
    testSqrt(1e50)
  }
}
