import java.util.ArrayList;

public class GardenMain {
  public static void main(String[] args) {

    Garden garden = new Garden();
    //PlantSuper plant = new PlantSuper();
    //double water=0.0;
    Garden garden1 = new Garden();

    //ArrayList<Tree> trees= new ArrayList<>();
    //ArrayList<Flower> flowers = new ArrayList<>();

    Flower tulip = new Flower("yellow", 0, 0);
    garden1.plantAdd(tulip);  //later: foreach
    Flower rose = new Flower("blue", 0, 0);
    garden1.plantAdd(rose);

    tulip.waterLevel();
    rose.waterLevel(); //for

    Tree oak = new Tree("purple", 0, 0);
    Tree palm = new Tree("orange", 0, 0);
    garden1.plantAdd(oak);
    garden1.plantAdd(palm);

    palm.waterLevel();
    oak.waterLevel();

    

    for (int i = 0; i < garden1.garden.size(); i++) {
      System.out.println(garden1.garden.get(i).level);
    }


  }
}
