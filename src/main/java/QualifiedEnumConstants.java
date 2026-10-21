sealed interface Direction permits CompassDirection, VerticalDirection {}
enum CompassDirection implements Direction { NORTH, SOUTH, EAST, WEST }
enum VerticalDirection implements Direction { UP, DOWN }

String fly(Direction direction) {
  return switch (direction) {
    case CompassDirection.NORTH -> "Flying north";
    case CompassDirection.SOUTH -> "Flying south";
    case CompassDirection.EAST  -> "Flying east";
    case CompassDirection.WEST  -> "Flying west";
    case VerticalDirection.UP   -> "Gaining altitude";
    case VerticalDirection.DOWN -> "Losing altitude";
  };
}

void main() {
  IO.println(fly(CompassDirection.EAST));
  IO.println(fly(VerticalDirection.UP));
}
