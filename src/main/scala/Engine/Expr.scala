package Engine

import com.sun.org.apache.xerces.internal.impl.dv.dtd.ENTITYDatatypeValidator

scaled trait Expr {
  object Expr {
    case class Number(val value: Double) extends Expr
    case object Var extends Expr
    case class Add(val left: Expr, right: Expr) extends Expr
    case class Mult(val left: Expr, right: Expr) extends Expr
    case class Function(val name: String, val args: Expr) extends Expr //sin ou cos



    def show(e : Expr): String = {
    }


    def eval(e: Expr)(variable: Double): Double = ???

    /**
     * Convert an expression to its postfix representation.
     *
     * eg. Mult(Var, Add(Const(2), Var)) => X 2 X + *
     */
    def toPostfix(e: Expr): String = ???

    /**
     * Convert an expression to its prefix representation.
     *
     * eg. Mult(Var, Add(Const(2), Var)) => (* X (+ 2 X))
     */
    def toPrefix(e: Expr): String = ???

    /**
     * Convert an expression to its infix representation.
     *
     * eg. Mult(Var, Add(Const(2), Var)) => X * (2 + X)
     */
    def toInfix(e: Expr): String = ???

    /**
     * Deriv an expression according to the variable.
     *
     * eg. deriv(Mult(Var, Add(Const(2), Var))) =>
     *  Add(Mult(Const(1.0), Add(Const(2.0), Var)),
     *      Mult(Var, Add(Const(0.0), Const(1.0))))
     */
    def deriv(e: Expr): Expr = ???

    /**
     * Bonus :
     * Get the polynomial coeficients from the expression
     *  eg.
     *  val exp1 = Plus(Var,Const(3))
     *  polyCoef(Mult(exp1,exp1)) => Vector(9,6,1)
     */
    def polyCoef(e: Expr): Vector[Double] = ???
  }
  //def expression (entityData: String)

}




