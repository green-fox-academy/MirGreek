public class Flower extends PlantSuper {
  String Color;
  double amount;
  double thirsty;

  public Flower(String color, int level, double thirsty) {
    super(color, level, 5,"Flower");
    this.amount = 0.75;
  }


}
