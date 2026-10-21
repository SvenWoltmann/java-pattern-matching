// Does not compile: the switch statement does not cover all possible input values

void print(Object obj) {
  switch (obj) {
    case String s  -> IO.println("string: " + s);
    case Integer i -> IO.println("integer, squared: " + i * i);
  }
}

void main() {}
