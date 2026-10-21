String classify(Number number) {
  return switch (number) {
    case Byte _, Short _, Integer _, Long _ -> "integral number";
    case Float _, Double _                  -> "floating-point number";
    default                                 -> "other number";
  };
}

void main() {
  IO.println(classify(12));
  IO.println(classify(3.14));
  IO.println(classify(new BigDecimal("1.5")));
}
