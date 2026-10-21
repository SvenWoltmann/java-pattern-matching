record Point(int x, int y) {}
record Line(Point from, Point to) {}

void print(Object obj) {
  if (obj instanceof Line(Point(int x1, int y1), Point(int x2, int y2))) {
    IO.println("line from " + x1 + "/" + y1 + " to " + x2 + "/" + y2);
  }
}

void main() {
  print(new Line(new Point(1, 2), new Point(5, 7)));
}
