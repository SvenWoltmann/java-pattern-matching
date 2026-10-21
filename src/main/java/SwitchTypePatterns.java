String describe(Object obj) {
  return switch (obj) {
    case String s when s.length() > 5 -> "long string: " + s;
    case String s                     -> "string: " + s;
    case Integer i                    -> "integer, squared: " + i * i;
    default                           -> "something else";
  };
}

void main() {
  IO.println(describe("Hello, world"));
  IO.println(describe("Hello"));
  IO.println(describe(12));
  IO.println(describe(3.14));
}
