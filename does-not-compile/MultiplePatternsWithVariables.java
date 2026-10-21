// Does not compile: illegal fall-through from a pattern

String classify(Number number) {
  return switch (number) {
    case Integer i, Long l -> "integral number";
    default                -> "other number";
  };
}

void main() {}
