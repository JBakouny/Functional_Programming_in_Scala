object ScalaStdLists {
  def main(args: Array[String]): Unit = {

    val s = "s" :: Nil

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
