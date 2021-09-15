import scala.annotation.tailrec
import scala.math.abs

object SqrtImpl {

  def sqrt(x : Double) = {
    def improve(guess: Double) =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double) : Boolean =
      abs((guess * guess - x) / x) < 0.001

    @tailrec
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    sqrtIter(1.0)
  }
}