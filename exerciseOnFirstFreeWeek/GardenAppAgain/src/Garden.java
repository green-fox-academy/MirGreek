import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plants> plants;

public void addPlantsToTheGarden(Plants plant){
  plants.add(plant);
}

  public void getStatus(){
    for (int i = 0; i <plants.size() ; i++) {
     if (plants.get(i).waterAmount < plants.get(i).getsThirsty){
       System.out.println( "The "+ plants.get(i).color + " "+ plants.get(i).type + " needs water!");
     } else System.out.println("The "+ plants.get(i).color + " " + plants.get(i).type+ " " + "doesn't need water");
    }
  }

  public void watering(double amount){
    System.out.println("Watering with " + amount );
     int numberOfPlants = plants.size();
    for (int i = 0; i <plants.size() ; i++) {
      if (plants.get(i).waterAmount < plants.get(i).getsThirsty){
          plants.get(i).waterAmount = (amount/numberOfPlants)*(plants.get(i).absorbsWater);
      }
    }
    getStatus();
  }




public Garden(){
    plants = new ArrayList<>();
    
}
}
