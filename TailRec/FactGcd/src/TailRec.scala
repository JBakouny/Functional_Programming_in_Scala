import scala.annotation.tailrec

object TailRec {
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  //  def fact(n : Int) : Int =
  //    if (n <= 1) 1 else n * fact(n - 1)

  def factorial(n : Int) : Int = {
    @tailrec
    def aux(n: Int, acc:Int) :Int =
      if (n <= 1) acc else aux(n-1, acc*n)
    aux(1, n)
  }

  def fact(n : Int) = {
    @tailrec
    def aux(a: Int, stackHist: Int = 1): Int = {
      if (a <= 1) stackHist else aux(a - 1, stackHist * a)
    }
    aux(n)
  }
}