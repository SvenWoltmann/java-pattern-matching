// Does not compile: variable s is already defined in method print(Object)

void print(Object obj) {
  String s = "local variable";
  if (obj instanceof String s) {
    IO.println(s);
  }
}

void main() {}
