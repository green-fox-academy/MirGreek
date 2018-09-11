import java.util.ArrayList;
import java.util.List;

public class Kamo extends Person {
  List<String> listOfAnimalsSout=new ArrayList<>();

  public List<String> getAdoptedAnimals(){
    String getStatus="";
    for (int i = 0; i <adoptedAnimals.size() ; i++) {
      getStatus = this.name + " adopted " + adoptedAnimals.get(i).name;
      listOfAnimalsSout.add(getStatus);
    }
    return listOfAnimalsSout;
  }


  public Kamo(String name) {
    super();
    String likes = "dog";
    this.name=name;
    this.age = 35;
  }
}
