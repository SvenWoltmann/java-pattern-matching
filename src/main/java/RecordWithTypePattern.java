record Point(int x, int y) {}

void print(Object obj) {
  if (obj instanceof Point p) {
    IO.println("point at " + p.x() + "/" + p.y());
  }
}

void main() {
  print(new Point(3, 4));
}
