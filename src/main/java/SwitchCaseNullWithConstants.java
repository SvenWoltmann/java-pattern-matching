String httpMethod(String method) {
  return switch (method) {
    case "GET", "HEAD" -> "read-only";
    case "POST", "PUT" -> "writes data";
    case null          -> "no method given";
    default            -> "unknown: " + method;
  };
}

void main() {
  IO.println(httpMethod("GET"));
  IO.println(httpMethod(null));
}
