public class Reptile extends Animal {




  @Override
  public String getName() {
  return name;
  }

  @Override
  public String breed() {
    return "gives eggs";
  }

  public Reptile(String name){
    super(name);

  }
}
