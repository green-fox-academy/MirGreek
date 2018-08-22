public class ElectricGuitar extends StingedInstrument {
  int numberOfString;
  @Override
  void sound() {
    System.out.println("Twang");
  }

  public ElectricGuitar(int numberOfStrings){
    super("Twang",numberOfStrings);
    this.numberOfString = numberOfStrings;
  }
  public ElectricGuitar(){
    this.sound();
    this.numberOfString = 6;
  }
}
