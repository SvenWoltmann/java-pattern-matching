String describe(Object obj) {
  return switch (obj) {
    case String s  -> "string: " + s;
    case Integer i -> "integer, squared: " + i * i;
    case null      -> "null";
    default        -> "something else";
  };
}

String describeOrDefault(Object obj) {
  return switch (obj) {
    case String s      -> "string: " + s;
    case Integer i     -> "integer, squared: " + i * i;
    case null, default -> "null or something else";
  };
}

void main() {
  IO.println(describe(null));
  IO.println(describeOrDefault(null));
  IO.println(describeOrDefault(3.14));
}
