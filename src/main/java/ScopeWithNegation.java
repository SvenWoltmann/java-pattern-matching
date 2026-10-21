int length(Object obj) {
  if (!(obj instanceof String s)) {
    return -1;
  }
  return s.length();
}

void main() {
  IO.println(length("Hello"));
  IO.println(length(12));
}
