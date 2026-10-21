record Point(int x, int y) {}

String describe(Object obj) {
  return switch (obj) {
    case null                         -> "null";
    case String s when s.length() > 5 -> "long string: " + s;
    case String s                     -> "string: " + s;
    case Integer i                    -> "integer, squared: " + i * i;
    case Point(int x, int y)          -> "point at " + x + "/" + y;
    default                           -> "something else";
  };
}

void main() {
  IO.println(describe("Hello, world"));
  IO.println(describe("Hello"));
  IO.println(describe(12));
  IO.println(describe(new Point(3, 4)));
  IO.println(describe(3.14));
  IO.println(describe(null));
}
