object Task {
  def sum (f : Int => Int, a : Int, b : Int): Int = {
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
  }

  def sumInt(a : Int, b : Int) : Int =
    sum(x => x, a, b)

  def sumCube(a : Int, b : Int) =
    sum(x => x * x * x, a, b)

  def fact(n : Int ): Int =
    if (n == 0) 1 else n * fact(n - 1)

  def sumFact(a : Int, b : Int) =
    sum(fact, a, b)

}
