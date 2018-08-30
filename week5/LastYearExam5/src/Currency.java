public class Currency {
  // It should have a code, a central bank name and a value field.
// Create a constructor for setting those values.
  String code;
  String centralBank;
  int value;

  public int getCurrency(){
  return value;
  }

  Currency(int value){
    String code;
    String centralBank;
    this.value=value;
  }
}
