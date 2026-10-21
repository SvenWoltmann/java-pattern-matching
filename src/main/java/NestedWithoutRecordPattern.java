record Point(int x, int y) {}
record Line(Point from, Point to) {}

void print(Object obj) {
  if (obj instanceof Line line) {
    Point from = line.from();
    Point to = line.to();
    if (from != null && to != null) {
      IO.println("line from " + from.x() + "/" + from.y()
          + " to " + to.x() + "/" + to.y());
    }
  }
}

void main() {
  print(new Line(new Point(1, 2), new Point(5, 7)));
}
