import org.scalatest.FunSuite

import scala.math.abs
import FixedPoint._

class TestSpec extends FunSuite {
  def isCloseEnough(expected: Double, actual: Double, precision: Double = 0.0000000000000000001) =
    abs((expected - actual) / expected) < precision

  test("FixPoint") {
    assert(isCloseEnough(fixedPoint(x => 1 + x / 2 ), 2))
  }

  test("Sqrt of 9") {
    assert(isCloseEnough(sqrt(9), 3))
  }
}
