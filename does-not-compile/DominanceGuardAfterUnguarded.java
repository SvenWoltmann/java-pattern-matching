// Does not compile: this case label is dominated by a preceding case label

String describe(Object obj) {
  return switch (obj) {
    case String s                     -> "string: " + s;
    case String s when s.length() > 5 -> "long string: " + s;
    default                           -> "something else";
  };
}

void main() {}
