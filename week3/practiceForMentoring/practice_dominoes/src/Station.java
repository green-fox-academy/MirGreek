public class Station {

  int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public Station() {
  }


  public void refill(Car car) {
     car.gasAmount++;
     this.gasAmount--;
   }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }
}
