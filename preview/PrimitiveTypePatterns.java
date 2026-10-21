// Preview feature in Java 23 to 27 - run with: java --enable-preview PrimitiveTypePatterns.java

String fits(int value) {
  return switch (value) {
    case byte b  -> "fits into a byte: " + b;
    case short s -> "fits into a short: " + s;
    case int i   -> "needs an int: " + i;
  };
}

void main() {
  IO.println(fits(100));
  IO.println(fits(1_000));
  IO.println(fits(100_000));
}
