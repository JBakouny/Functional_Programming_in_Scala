import org.scalatest.FunSuite

import TailRec._
// x.y.z
class TestSpec extends FunSuite {
  test("Factorial test") {
    assert(factorial(5) === 120)
  }

  test("Fact test") {
    assert(fact(5) === 120)
  }

  test("FactBigInt test") {
    assert(fact(BigInt(5)) === 121)
  }

  test("Gcd test") {
    assert(gcd(21, 14) === 7)
  }
}
