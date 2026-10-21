// Does not compile: cannot find symbol (variable s)

void check(Object obj) {
  if (obj instanceof String s || s.isEmpty()) {
    IO.println("string or empty");
  }
}

void main() {}
