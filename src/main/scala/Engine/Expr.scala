package Engine



  object Expr {
    trait Expr
    case class Number(val value: Double) extends Expr

    case class Const(val value: Double, val name: String) extends Expr

    case class Variable(val name: String) extends Expr

    // binary operators
    case class OpAdd(val leftOp: Expr, val rightOp: Expr) extends Expr

    case class OpSub(val leftOp: Expr, val rightOp: Expr) extends Expr

    case class OpMul(val leftOp: Expr, val rightOp: Expr) extends Expr

    case class OpDiv(val leftOp: Expr, val rightOp: Expr) extends Expr

    // unary operators
    case class OpUnaryPlus(val rightOp: Expr) extends Expr

    case class OpUnaryMinus(val rightOp: Expr) extends Expr

    // function
    case class OpFun(val name: String, val args: List[Expr]) extends Expr
  }

    /*
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

     */






