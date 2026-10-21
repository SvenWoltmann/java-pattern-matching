void print(Object obj) {
  if (obj instanceof String) {
    String s = (String) obj;
    IO.println("string of length " + s.length());
  } else if (obj instanceof Integer) {
    Integer i = (Integer) obj;
    IO.println("integer, squared: " + i * i);
  }
}

void main() {
  print("Hello");
  print(12);
}
