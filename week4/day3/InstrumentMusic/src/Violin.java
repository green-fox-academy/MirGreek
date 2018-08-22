public class Violin extends StingedInstrument{
  @Override
  void sound() {
    System.out.println("Screech");
  }
  public Violin(int numberOfStrings){
    super("Screech",numberOfStrings);
    this.numberOfStrings = numberOfStrings;
  }
}
