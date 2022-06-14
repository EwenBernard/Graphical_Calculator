package Engine

import scala.util.parsing.combinator.{JavaTokenParsers, PackratParsers}

class Parser extends JavaTokenParsers with PackratParsers {
    type R = Expr
    lazy val expr: PackratParser[R] = chainl1(term, "+" ^^^ OpAdd | "-" ^^^ OpSub)
    lazy val term: PackratParser[R] = chainl1(prim, "*" ^^^ OpMul | "/" ^^^ OpDiv)
}
