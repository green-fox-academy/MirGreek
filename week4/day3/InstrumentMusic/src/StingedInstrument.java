public abstract class StingedInstrument extends Instrument {
    int numberOfStrings;

    abstract void sound();

    public void play(){
      sound();
    }

  public StingedInstrument(String name,int numberOfStrings){
    super(name);
    this.numberOfStrings = numberOfStrings;
  }
  public StingedInstrument(){

  }
}
