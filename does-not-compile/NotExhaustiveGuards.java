// Does not compile: the switch expression does not cover all possible input values

String sign(Integer number) {
  return switch (number) {
    case Integer i when i < 0  -> "negative";
    case Integer i when i == 0 -> "zero";
    case Integer i when i > 0  -> "positive";
  };
}

void main() {}
