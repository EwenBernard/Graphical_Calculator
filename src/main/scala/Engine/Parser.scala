package Engine

import scala.util.parsing.combinator.Parsers

object Parser extends Parsers{
   override type Elem = ExprToken

  class ExprTokenReader(tokens: Seq[ExprToken])
}
