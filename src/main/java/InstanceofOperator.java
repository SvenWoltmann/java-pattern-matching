void main() {
  Object obj = "Hello";
  IO.println(obj instanceof String);
  IO.println(obj instanceof CharSequence);
  IO.println(obj instanceof Comparable);
  IO.println(obj instanceof Integer);

  Object nothing = null;
  IO.println(nothing instanceof Object);
}
