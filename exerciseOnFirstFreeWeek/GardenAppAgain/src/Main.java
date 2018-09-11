import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");


    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");

    Garden garden = new Garden();
    garden.addPlantsToTheGarden(tree1);
    garden.addPlantsToTheGarden(tree2);
    garden.addPlantsToTheGarden(flower1);
    garden.addPlantsToTheGarden(flower2);

    garden.getStatus();
    garden.watering(40);
    garden.watering(70);
    System.out.println(":)");
  }
}
/*
In the example after creating them you should show the user, how the garden looks like.
After that the program should water the garden twice, first with the amount of 40 then with 70.
 And after every watering the user should see the state of the garden as you can see in the output.
 */