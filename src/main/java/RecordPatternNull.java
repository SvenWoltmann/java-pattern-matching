record Point(int x, int y) {}
record Line(Point from, Point to) {}

void main() {
  Object nothing = null;
  IO.println(nothing instanceof Point(int x, int y));

  Line half = new Line(new Point(1, 2), null);
  IO.println(half instanceof Line(Point from, Point to));
  IO.println(half instanceof Line(var from, var to));
  IO.println(half instanceof Line(Point(int x1, int y1), Point to));
  IO.println(half instanceof Line(Point(int x1, int y1), Point(int x2, int y2)));
}
