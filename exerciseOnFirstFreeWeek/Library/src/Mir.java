import java.util.ArrayList;
import java.util.List;

public class Mir extends Person {
  List<String> listOfAnimalsSout=new ArrayList<>();

  public List<String> getAdoptedAnimals(){
    String getStatus="";
    for (int i = 0; i <adoptedAnimals.size() ; i++) {
      getStatus = this.name + " adopted " + adoptedAnimals.get(i).name;
      listOfAnimalsSout.add(getStatus);
    }
    return listOfAnimalsSout;
  }




  public Mir() {
    super();
    String likes = "horse";
    this.name="Mir";
    this.age=27;
  }
}
