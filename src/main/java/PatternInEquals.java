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
  IO.println(new Money(999, "EUR").equals(new Money(999, "EUR")));
  IO.println(new Money(999, "EUR").equals(new Money(999, "USD")));
  IO.println(new Money(999, "EUR").equals("9.99 EUR"));
}
