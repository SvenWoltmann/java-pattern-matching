// Does not compile: this case label is dominated by a preceding case label

String greet(String text) {
  return switch (text) {
    case String s -> "text: " + s;
    case "Hello"  -> "Hello back";
  };
}

void main() {}
