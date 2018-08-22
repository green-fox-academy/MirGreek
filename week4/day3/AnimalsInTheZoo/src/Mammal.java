public class Mammal extends Animal {

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "gives birth";
  }
  public Mammal(String name){
    super(name);

  }
}
