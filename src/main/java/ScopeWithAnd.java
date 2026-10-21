void print(Object obj) {
  if (obj instanceof String s && s.length() > 5) {
    IO.println("long string: " + s);
  } else if (obj instanceof Integer i) {
    IO.println("integer, squared: " + i * i);
  } else {
    IO.println("something else");
  }
}

void main() {
  print("Hello, world");
  print("Hello");
  print(12);
}
