import scala.annotation.tailrec

object Task {

  @tailrec
  def mapReduce(zero : Int, op : (Int, Int) => Int)(f : Int => Int)(a : Int, b : Int): Int =
      if (a > b) zero else mapReduce(op(zero, f(a)), op)(f)(a + 1, b)

  def product : (Int => Int) => (Int, Int) => Int =
    mapReduce(1, (x, y) => x * y)

  def sum : (Int => Int) => (Int, Int) => Int =
    mapReduce(0, (x, y) => x + y)

  def sumInt : (Int, Int) => Int =
    sum(x => x)

  def sumCube: (Int, Int) => Int =
    sum(x => x * x * x)

  def fact(n : Int): Int =
    product(x => x)(1, n)

  def sumFact: (Int, Int) => Int =
    sum(fact)

}
