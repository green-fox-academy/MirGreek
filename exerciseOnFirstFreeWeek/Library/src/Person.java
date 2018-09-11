import java.util.ArrayList;
import java.util.List;

public class Person {
  String name;
  int age;
  List<Animal> adoptedAnimals;

  public void adoptAnimal(Animal animal) {
    for (int i = 0; i <adoptedAnimals.size() ; i++) {
      System.out.println(adoptedAnimals.get(i).name);
    }
    if (!adoptedAnimals.contains(animal)) {
      adoptedAnimals.add(animal);
    } else System.out.println(animal+"has been already adopted by someone else :(");
    System.out.println(animal.name + " has been adopted by " + this.name);
    //getAdoptedAnimals();
  }
  


  public Person(){
    this.name = name;
    this.age = age;
    adoptedAnimals=new ArrayList<>();
  }
}
