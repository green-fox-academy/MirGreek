public class BassGuitar extends StingedInstrument{


  @Override
  void sound() {
    System.out.println("Duum-duum-duum");
  }
  public BassGuitar(int numberOfStrings){
    super("Duum-duum-duum",numberOfStrings);
    this.numberOfStrings = numberOfStrings;
  }
}
