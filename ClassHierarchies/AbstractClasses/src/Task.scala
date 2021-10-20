
abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}

class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

  override def toString: String = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x) else this

  override def toString: String = "{" + left.toString + elem + right.toString + "}"
}

abstract class IntList {
  def head : Int
  def tail : IntList
  def isEmpty : Boolean

}
class Nil() extends IntList {
  def head: Int = throw new IllegalArgumentException
  def tail: IntList = throw new IllegalArgumentException
  def isEmpty: Boolean = true

  override def toString: String = "Nil"
}

class Cons(val head : Int, val tail : IntList) extends IntList {
  def isEmpty: Boolean = false

  override def toString: String = head + " :: " + tail
}


object Task {
  def main(args: Array[String]): Unit = {

    // Tree
    val t = (new Empty).incl(10).incl(3).incl(17)
    val t2 = t.incl(5)


    println(t)// thread1
    println(t2) // thread2

    //List
    val vide = new Nil
    val l3 = new Cons(3, vide)
    val l2 = new Cons(2, l3)
    val l1 = new Cons(1, l2)

    println(l3)
  }
}