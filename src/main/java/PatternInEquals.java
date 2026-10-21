final class Money {
  private final long cents;
  private final String currency;

  Money(long cents, String currency) {
    this.cents = cents;
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    return o instanceof Money other
        && cents == other.cents
        && currency.equals(other.currency);
  }

  @Override
  public int hashCode() {
    return Long.hashCode(cents) * 31 + currency.hashCode();
  }
}

void main() {
  Money price = new Money(999, "EUR");
  IO.println(price.equals(new Money(999, "EUR")));
  IO.println(price.equals(new Money(999, "USD")));
  Object text = "9.99 EUR";
  IO.println(price.equals(text));
}
