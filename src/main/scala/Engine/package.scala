import scala.io.Source
//import Parser._

package object Engine {

  def show() = {
    val parser = new Parser
    for (ln <- Source.stdin.getLines)
      println(parser.parseAll(parser.expr, ln))
  }



}


