void print(Object obj) {
  if (obj instanceof String s) {
    s = s.trim();
    IO.println("[" + s + "]");
  }
}

void main() {
  print("  Hello  ");
}
