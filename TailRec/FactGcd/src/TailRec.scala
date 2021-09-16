import scala.annotation.tailrec

object TailRec {
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def fact(n : BigInt) : BigInt =
    if (n <= 1) 1 else n * fact(n - 1)

  // Implement a tail recursive factoriel function

  def fact(n : BigInt) : BigInt = {
    @tailrec
    def factIter(acc : BigInt, i : BigInt) : BigInt = {
      ???
    }
    factIter(1, n)
  }

}