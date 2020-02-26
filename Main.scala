package test

import com.softwaremill.macwire.wire

case class Foo()

object Main {
  lazy val foo = wire[Foo]

  def main(args: Array[String]): Unit = {
    println(foo)
  }
}

