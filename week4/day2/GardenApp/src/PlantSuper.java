public class PlantSuper {
  String color;
  double level;
  double thirsty;
  String plantType;


  PlantSuper(String Color, double level, double thirsty, String plantType) {
    this.color = Color;
    this.level = level;
    this.thirsty = thirsty;
    this.plantType = plantType;
  }

  public void waterLevel() {
    if (level < thirsty) {
      System.out.println("The " + color + " " + plantType + " needs water!");
    } else
      System.out.println("The " + color + " " + plantType + " doesn't need water!");

  }

  public double watering() {

    if (level < thirsty) {
      level = level + 40;
      if (plantType.equalsIgnoreCase("Tree")) {
        return level * 0.4;
      } else return level * 0.75;

    }return level;
  }
}

