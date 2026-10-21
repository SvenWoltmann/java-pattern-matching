String httpMethod(String method) {
  return switch (method) {
    case null          -> "no method given";
    case "GET", "HEAD" -> "read-only";
    case "POST", "PUT" -> "writes data";
    default            -> "unknown: " + method;
  };
}

void main() {
  IO.println(httpMethod("GET"));
  IO.println(httpMethod(null));
}
