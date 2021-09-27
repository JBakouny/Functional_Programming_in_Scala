import scala.annotation.tailrec
import scala.math.abs

object FixedPoint {



  def fixedPoint(f: Double => Double) = {
    def isCloseEnough(expected: Double, actual: Double, precision: Double = 0.0000000000000000001) =
      abs((expected - actual) / expected) < precision

    @tailrec
    def iterate(x: Double): Double = {
      val next = f(x)
      if (isCloseEnough(x, next)) next
      else iterate(next)
    }

    iterate(1)
  }

  def averageDamp(f : Double => Double) (x : Double) : Double =
    (x + f(x)) / 2

  // (Double => Double) => Double => Double


  def sqrt(x : Double) =
    fixedPoint(averageDamp(y => x / y))





}
