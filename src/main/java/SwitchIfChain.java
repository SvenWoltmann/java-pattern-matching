String describe(Object obj) {
  if (obj instanceof String s && s.length() > 5) {
    return "long string: " + s;
  } else if (obj instanceof String s) {
    return "string: " + s;
  } else if (obj instanceof Integer i) {
    return "integer, squared: " + i * i;
  } else {
    return "something else";
  }
}

void main() {
  IO.println(describe("Hello, world"));
  IO.println(describe("Hello"));
  IO.println(describe(12));
  IO.println(describe(3.14));
}
