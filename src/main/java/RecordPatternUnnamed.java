record Point(int x, int y) {}
record Line(Point from, Point to) {}

String start(Object obj) {
  return switch (obj) {
    case Line(Point(var x, var y), _) -> "line starting at " + x + "/" + y;
    default                           -> "not a line";
  };
}

void main() {
  IO.println(start(new Line(new Point(1, 2), new Point(5, 7))));
}
