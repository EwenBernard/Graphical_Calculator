package Engine

import scala.util.parsing.combinator.{JavaTokenParsers, PackratParsers}

class Parser extends JavaTokenParsers with PackratParsers {
    import Expr._
    type R = Expr
    lazy val expr: PackratParser[R] = chainl1(term, "+" ^^^ OpAdd | "-" ^^^ OpSub)
    lazy val term: PackratParser[R] = chainl1(prim, "*" ^^^ OpMul | "/" ^^^ OpDiv)

    lazy val prim: PackratParser[R] = "-" ~ prim ^^ { case _ ~ p => OpUnaryMinus(p) } | ident ~ opt(func) ^^ { case id ~ None => Variable(id)
      case id ~ Some(args) => OpFun(id, args)  } |
      floatingPointNumber ^^{ case n => Number(n.toDouble) }  |
      "(" ~> expr <~ ")"
    lazy val func: PackratParser[List[R]] = "(" ~> repsep(farg, ",") <~ ")"
    lazy val farg: PackratParser[R] = expr
}
