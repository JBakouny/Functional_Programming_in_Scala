object Task {
  abstract class Base {
    def foo = 1
    def bar: Int
  }

  class Sub extends Base {
    override def foo = 2
    override def bar = 3
  }

  def main(args: Array[String]): Unit = {

  }
}