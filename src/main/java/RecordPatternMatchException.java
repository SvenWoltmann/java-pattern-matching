record Temperature(double celsius) {
  @Override
  public double celsius() {
    if (Double.isNaN(celsius)) {
      throw new IllegalStateException("not measured");
    }
    return celsius;
  }
}

String describe(Object obj) {
  return switch (obj) {
    case Temperature(double celsius) -> celsius + " °C";
    default                          -> "something else";
  };
}

void main() {
  IO.println(describe(new Temperature(21.5)));
  try {
    IO.println(describe(new Temperature(Double.NaN)));
  } catch (MatchException e) {
    IO.println(e);
    IO.println("cause: " + e.getCause());
  }
}
