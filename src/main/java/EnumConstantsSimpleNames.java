enum CompassDirection { NORTH, SOUTH, EAST, WEST }

String fly(CompassDirection direction) {
  return switch (direction) {
    case NORTH -> "Flying north";
    case SOUTH -> "Flying south";
    case EAST  -> "Flying east";
    case WEST  -> "Flying west";
  };
}

void main() {
  IO.println(fly(CompassDirection.EAST));
}
