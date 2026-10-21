// Does not compile: local variables referenced from a guard must be final or effectively final

String describe(Object obj, int limit) {
  limit++;
  return switch (obj) {
    case String s when s.length() > limit -> "long string: " + s;
    default                               -> "something else";
  };
}

void main() {}
