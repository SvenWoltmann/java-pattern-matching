// Does not compile: this case label is dominated by a preceding case label

String describe(Object obj) {
  return switch (obj) {
    case Number n  -> "number: " + n;
    case Integer i -> "integer: " + i;
    default        -> "something else";
  };
}

void main() {}
