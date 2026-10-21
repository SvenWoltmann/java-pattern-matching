// Does not compile: Object cannot be safely cast to List<String>

void check(Object obj) {
  if (obj instanceof List<String> list) {
    IO.println(list.size());
  }
}

void main() {}
