// Does not compile: not a statement - a record pattern takes no constants

record Point(int x, int y) {}

String describe(Point point) {
  return switch (point) {
    case Point(0, int y) -> "on the y-axis";
    default              -> "somewhere else";
  };
}

void main() {}
