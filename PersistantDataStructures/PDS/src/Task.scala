
object Task {
  abstract class StringList {
    def head: String
    def tail: StringList
    def isEmpty: Boolean

  }

  class Nil() extends StringList{
    def head: String = throw new IllegalArgumentException
    def tail: StringList = throw new IllegalArgumentException
    def isEmpty: Boolean = true

    override def toString: String = ""
  }

  class Cons(val head: String, val tail: StringList) extends StringList {
    override def isEmpty: Boolean = false

    override def toString: String = if (tail.isEmpty) head else tail + " -> " + head
  }

  def main(args: Array[String]): Unit = {

    val vide = Nil

    val s = "s" :: vide

    // Parrallel
    val d = "d" :: s
    val e1 = "e" :: s
    val p = "p" :: s

    // Parrallel
    val b = "b" :: d
    val c1 = "c" :: d
    val e2 = "e" :: d


    val h = "h" :: e2
    val r = "r" :: e2

    val f = "f" :: r

    val c2 = "c" :: f
    val g = "G" :: f

    // o(1) pour la création d'une nouvelle liste

    /* Using immutable functional lists when representing routes in search algorithms is very beneficial
    in term of memory complexity: each element of the route is created once and used when needed.
    This also has an advantage on a performance scale since copying from the memory takes time.
    */

    println("The different routes of this algorithm are :")
    println(s)
    println(d)
    println(e1)
    println(p)
    println(b)
    println(c1)
    println(e2)
    println(h)
    println(r)
    println(f)
    println(c2)
    println(g)


  }
}
