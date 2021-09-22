import scala.annotation.tailrec

object Task {

  def mapReduce(zero : Int, op : (Int, Int) => Int, f : Int => Int, a : Int, b : Int): Int =
      if (a > b) zero else mapReduce(op(zero, f(a)), op, f, a + 1, b)

  def product(f : Int => Int, a : Int, b : Int): Int =
    mapReduce(1, (x, y) => x * y, f, a, b)

  def sum (f : Int => Int, a : Int, b : Int): Int =
    mapReduce(0, (x, y) => x + y, f, a, b)

  def sumInt(a : Int, b : Int) : Int =
    sum(x => x, a, b)

  def sumCube(a : Int, b : Int) =
    sum(x => x * x * x, a, b)

  def fact(n : Int): Int =
    product(x => x, 1, n)

  def sumFact(a : Int, b : Int) =
    sum(fact, a, b)

}
