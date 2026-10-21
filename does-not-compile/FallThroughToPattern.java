// Does not compile: illegal fall-through to a pattern

void print(Object obj) {
  switch (obj) {
    case Integer i:
      IO.println("integer: " + i);
    case String s:
      IO.println("string: " + s);
      break;
    default:
      IO.println("something else");
  }
}

void main() {}
