public class UsaDollar extends Currency {


  UsaDollar(int value) {
    super(value);
    this.centralBank="Federal Reserve System";
    this.code="USD";
  }
}
// Create a UsaDollar class that inherits from the Currency.
// Create a constructor that accepts the value.
// The code should be "USD"
// and the central bank name should be "Federal Reserve System"