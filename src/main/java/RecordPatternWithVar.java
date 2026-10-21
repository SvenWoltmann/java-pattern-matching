record Pair<T>(T first, T second) {}

void print(Pair<String> pair) {
  if (pair instanceof Pair(var first, var second)) {
    IO.println(first.toUpperCase() + " " + second.length());
  }
}

void main() {
  print(new Pair<>("Hello", "world"));
}
