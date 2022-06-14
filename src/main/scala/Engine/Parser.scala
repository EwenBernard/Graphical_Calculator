package Engine

import scala.util.parsing.combinator.{JavaTokenParsers, PackratParsers}

object Parser extends JavaTokenParsers with PackratParsers {
   override type Elem = ExprToken

  class ExprTokenReader(tokens: Seq[ExprToken])
}
