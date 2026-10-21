record Point(int x, int y) {}

String describe(Point point) {
  return switch (point) {
    case Point(int x, int y) when x == 0 && y == 0 -> "origin";
    case Point(int x, int y) when x == y           -> "on the diagonal: " + x;
    case Point(int x, int y)                       -> "point at " + x + "/" + y;
  };
}

void main() {
  IO.println(describe(new Point(0, 0)));
  IO.println(describe(new Point(5, 5)));
  IO.println(describe(new Point(3, 4)));
}
