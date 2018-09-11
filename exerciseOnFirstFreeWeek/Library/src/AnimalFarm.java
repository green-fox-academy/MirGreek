import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalFarm implements AnimalsEat {
  List<Animal> animalHouse;


  public void addAnimal(Animal animal){
    animalHouse.add(animal);

  }


  @Override
  public void feed(int amount) {
    for (int i = 0; i <animalHouse.size() ; i++) {
       animalHouse.get(i).eat(amount);
    }
    System.out.println(animalHouse.size());
  }

  public void adoptation(Animal animal, Person person){
    animalHouse.remove(animal);
    System.out.println(animal + " has been adopted by " + person);
  }


  public AnimalFarm(){
    animalHouse= new ArrayList<>();
  }

}
