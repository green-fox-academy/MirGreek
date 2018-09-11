public class Bird extends Animal {

  private boolean canFly;

  public Bird(String color, int age, double weigh,boolean canFly) {
    super(color, age, 0.0);
    this.canFly=canFly;
  }

  public void sleep(){
    System.out.println("I sleep on the tree");
  }
}
