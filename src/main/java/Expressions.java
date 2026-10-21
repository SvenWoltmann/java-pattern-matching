sealed interface Expr permits Const, Neg, Add, Mul {}
record Const(int value) implements Expr {}
record Neg(Expr operand) implements Expr {}
record Add(Expr left, Expr right) implements Expr {}
record Mul(Expr left, Expr right) implements Expr {}

int eval(Expr expr) {
  return switch (expr) {
    case Const(int value)           -> value;
    case Neg(Expr operand)          -> -eval(operand);
    case Add(Expr left, Expr right) -> eval(left) + eval(right);
    case Mul(Expr left, Expr right) -> eval(left) * eval(right);
  };
}

String format(Expr expr) {
  return switch (expr) {
    case Const(int value)           -> String.valueOf(value);
    case Neg(Expr operand)          -> "(-" + format(operand) + ")";
    case Add(Expr left, Expr right) ->
        "(" + format(left) + " + " + format(right) + ")";
    case Mul(Expr left, Expr right) -> format(left) + " * " + format(right);
  };
}

Expr simplify(Expr expr) {
  return switch (expr) {
    case Mul(Const(int c), Expr _) when c == 0 -> new Const(0);
    case Mul(Const(int c), Expr e) when c == 1 -> simplify(e);
    case Mul(Expr e, Const(int c)) when c == 1 -> simplify(e);
    case Add(Const(int c), Expr e) when c == 0 -> simplify(e);
    case Neg(Neg(Expr e))                      -> simplify(e);
    case Neg(Expr e)                           -> new Neg(simplify(e));
    case Add(Expr l, Expr r)                   -> new Add(simplify(l), simplify(r));
    case Mul(Expr l, Expr r)                   -> new Mul(simplify(l), simplify(r));
    case Const c                               -> c;
  };
}

void main() {
  Expr expr = new Mul(new Add(new Const(2), new Const(3)), new Const(4));
  IO.println(format(expr) + " = " + eval(expr));

  Expr redundant =
      new Mul(new Const(1), new Neg(new Neg(new Add(new Const(0), new Const(7)))));
  IO.println(format(redundant) + " = " + eval(redundant));

  Expr simplified = simplify(redundant);
  IO.println(format(simplified) + " = " + eval(simplified));
}
