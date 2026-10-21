// Does not compile: this case label is dominated by a preceding case label

String describe(Object obj) {
  return switch (obj) {
    default       -> "something else";
    case String s -> "string: " + s;
  };
}

void main() {}
