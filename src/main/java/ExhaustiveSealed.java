sealed interface Shape permits Circle, Square, Rectangle {}
record Circle(double radius) implements Shape {}
record Square(double side) implements Shape {}
record Rectangle(double width, double height) implements Shape {}

double area(Shape shape) {
  return switch (shape) {
    case Circle c    -> Math.PI * c.radius() * c.radius();
    case Square s    -> s.side() * s.side();
    case Rectangle r -> r.width() * r.height();
  };
}

void main() {
  IO.println(area(new Circle(1)));
  IO.println(area(new Square(2)));
  IO.println(area(new Rectangle(2, 3)));
}
