public class GoldenRetriever extends Dogs {


    public final String bla = "aha2"; // not changeable
  public GoldenRetriever(String name) {
    super(name); // this calls the Dogs' constructor
    //super.setName(); -> super's name
    //setName(); -> this classes' name
  }
  public void setName(String name){
    this.name =name;

  }
}
