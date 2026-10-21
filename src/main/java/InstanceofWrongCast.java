void print(Object obj) {
  if (obj instanceof Number) {
    Integer i = (Integer) obj;
    IO.println("integer, squared: " + i * i);
  }
}

void main() {
  print(12);
  print(12L);
}
