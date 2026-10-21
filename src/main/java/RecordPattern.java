record Point(int x, int y) {}

void print(Object obj) {
  if (obj instanceof Point(int x, int y)) {
    IO.println("point at " + x + "/" + y);
  }
}

void main() {
  print(new Point(3, 4));
}
