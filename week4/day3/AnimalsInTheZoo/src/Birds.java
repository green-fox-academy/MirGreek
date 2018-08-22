public class Birds extends Animal {
  @Override
  public String getName() {
    return name;
  }

  @Override
 public String breed() {
    return "gives eggs";
  }
  public Birds(String name){
    super(name);

  }
}
