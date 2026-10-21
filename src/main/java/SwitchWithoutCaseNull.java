String describe(Object obj) {
  return switch (obj) {
    case String s when s.length() > 5 -> "long string: " + s;
    case String s                     -> "string: " + s;
    case Integer i                    -> "integer, squared: " + i * i;
    default                           -> "something else";
  };
}

// Throws a NullPointerException - the switch has no case null.
void main() {
  IO.println(describe(null));
}
