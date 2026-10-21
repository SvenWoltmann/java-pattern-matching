void print(Object obj) {
  if (obj instanceof String s) {
    IO.println("string of length " + s.length());
  } else if (obj instanceof Integer i) {
    IO.println("integer, squared: " + i * i);
  }
}

void main() {
  print("Hello");
  print(12);
}
