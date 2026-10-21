String greet(String text) {
  return switch (text) {
    case "Hello"                      -> "Hello back";
    case String s when s.length() > 5 -> "long text: " + s;
    case String s                     -> "short text: " + s;
  };
}

void main() {
  IO.println(greet("Hello"));
  IO.println(greet("Good morning"));
  IO.println(greet("Hi"));
}
