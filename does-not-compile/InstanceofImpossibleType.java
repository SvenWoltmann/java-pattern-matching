// Does not compile: incompatible types: Number cannot be converted to String

void check(Number number) {
  if (number instanceof String) {
    IO.println("never");
  }
}

void main() {}
