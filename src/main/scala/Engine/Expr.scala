package Engine

import com.sun.org.apache.xerces.internal.impl.dv.dtd.ENTITYDatatypeValidator

scaled trait Expr {
  object Expr {
    case class Number(value: Double) extends Expr
    case object Var extends Expr

    case class Add(left: Expr, right: Expr) extends Expr

    case class Mult(left: Expr, right: Expr) extends Expr

    /**
     * Evaluate an expression for a given value for the variable.
     *
     * eg. eval(Mult(Var, Add(Const(2), Var)))(3) => 15
     */
    def eval(expression: Expression)(variable: Double): Double = ???

    /**
     * Convert an expression to its postfix representation.
     *
     * eg. Mult(Var, Add(Const(2), Var)) => X 2 X + *
     */
    def toPostfix(expression: Expression): String = ???

    /**
     * Convert an expression to its prefix representation.
     *
     * eg. Mult(Var, Add(Const(2), Var)) => (* X (+ 2 X))
     */
    def toPrefix(expression: Expression): String = ???

    /**
     * Convert an expression to its infix representation.
     *
     * eg. Mult(Var, Add(Const(2), Var)) => X * (2 + X)
     */
    def toInfix(expression: Expression): String = ???

    /**
     * Deriv an expression according to the variable.
     *
     * eg. deriv(Mult(Var, Add(Const(2), Var))) =>
     *  Add(Mult(Const(1.0), Add(Const(2.0), Var)),
     *      Mult(Var, Add(Const(0.0), Const(1.0))))
     */
    def deriv(expression: Expression): Expression = ???

    /**
     * Bonus :
     * Get the polynomial coeficients from the expression
     *  eg.
     *  val exp1 = Plus(Var,Const(3))
     *  polyCoef(Mult(exp1,exp1)) => Vector(9,6,1)
     */
    def polyCoef(expression: Expression): Vector[Double] = ???
  }
  //def expression (entityData: String)

}




