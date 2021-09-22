import scala.annotation.tailrec

object TailRec {
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def fact(n : BigInt) : BigInt =
    if (n <= 1) 1 else n * fact(n - 1)

  def factorial(n : BigInt) : BigInt = {
    @tailrec
    def aux(n: BigInt, acc: BigInt) : BigInt =
      if (n <= 1) acc else aux(n-1, acc*n)
    aux(n, 1)
  }

  def fact(n : Int) = {
    @tailrec
    def aux(a: Int, stackHist: Int = 1): Int = {
      if (a <= 1) stackHist else aux(a - 1, stackHist * a)
    }
    aux(n)
  }

}