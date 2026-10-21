void main() {
  List<String> names = new ArrayList<>(List.of("Anna", "Ben"));
  if (names instanceof ArrayList<String> arrayList) {
    arrayList.ensureCapacity(100);
    IO.println("ArrayList with " + arrayList.size() + " elements");
  }
}
