String greet(String text) {
  return switch (text) {
    case "Hello"  -> "Hello back";
    case String s -> "text: " + s;
  };
}

void main() {
  IO.println(greet("Hello"));
  IO.println(greet("Hi"));
}
