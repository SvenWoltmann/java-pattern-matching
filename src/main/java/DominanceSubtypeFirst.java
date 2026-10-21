String describe(Object obj) {
  return switch (obj) {
    case Integer i -> "integer: " + i;
    case Number n  -> "some other number: " + n;
    default        -> "something else";
  };
}

void main() {
  IO.println(describe(12));
  IO.println(describe(3.14));
  IO.println(describe("Hello"));
}
