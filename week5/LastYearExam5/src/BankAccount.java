public class BankAccount {
  String name;
  String pinCode;
  Currency currency;
  int parameter;

public int deposit(int parameter){
  if ( parameter < 0){
    System.out.println("The account is in debth!");
    return 0;
  } else currency.value+=parameter;
    System.out.println("The deposit is: " + new Currency(parameter).value);
    return new Currency(parameter).value;
}

public int withdraw(String pinCode, int amount){
  if(this.pinCode.equals(pinCode)){
    System.out.println("Pin code is correct!");
    if (currency.value > amount ) {
      //System.out.println(amount);
      currency.value -= amount;
      return amount;
    } else System.out.println("Your account has not this amount of money!");
      return 0;
  } else System.out.println("Pin code is incorrect!");
  return 0;
}


  BankAccount(String name, String pinCode, Currency currency ){
    this.currency = currency;
    this.pinCode = pinCode;
    this.name = name;

  }
}
// Create a BankAccount class.
// It should have a name, a pin code and a Currency field.
// Create a constructor for setting those values.

// Create a deposit method which check if the given parameter is positive
// then adds the parameter to the Currency's value field.

// Create a withdraw method with two parameters: a pin code and an amount.
// It should check if the given pin is correct (equals with the original pin)
// and the Currency's value is more than the amount parameter.
// If so, subtract the amount from the Currency's value and return with the amount.
// Otherwise don't modify the Currency's value and return with 0.