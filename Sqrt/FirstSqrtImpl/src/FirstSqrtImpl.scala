import scala.math.abs

object FirstSqrtImpl {

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) = {
    abs(guess * guess - x) < 0.001
  }

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def sqrt(x : Double) = sqrtIter(1.0, x)

  def display(x : Double) : Unit = {
    println("sqrt(" + x + ") = " + sqrt(x))
  }


  def main(args: Array[String]): Unit = {
    display(2)
    display(4)
    display(1e-6) // 10 ** -6 ->> le sqrt devra être 10 ** -3
    display(1e20) // 10 ** 20 ->> correct
    display(1e50) // 10 ** 50 ->> boucle infinie (même problème se produit en impératif dans des languages comme C++)
  }
}