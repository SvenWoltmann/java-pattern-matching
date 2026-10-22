String describe(Object obj) {
  return switch (obj) {
    case String s -> "string: " + s;
    default       -> "something else";
  };
}

void main() {
  IO.println(describe("Hello"));
  IO.println(describe(12));
}
