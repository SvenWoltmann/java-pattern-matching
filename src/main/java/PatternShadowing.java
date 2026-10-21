public class PatternShadowing {
  private String s = "field";

  void print(Object obj) {
    IO.println(s);
    if (obj instanceof String s) {
      IO.println(s);
      IO.println(this.s);
    }
  }

  void main() {
    print("pattern variable");
  }
}
