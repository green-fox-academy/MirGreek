import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Dog nessie = new Dog("Nessie","wolfy",3);
    System.out.println(nessie.getName());
    nessie.bark();
    nessie.doYouWantToWalk();

    Dog dorka = new Dog("Dorka","lightbrown",5);
    dorka.bark();
    Dog dorka2 = new Dog("Dorka","lightbrown",5);

    Dog furkesz = new Dog();
    furkesz.setName("Fürkész");
    System.out.println(Dog.CLASSIFICATION);

    Bird bird = new Bird("yellow",1,0.3,true);

    List<Animal> animals = new ArrayList<>();
    animals.add(bird);
    animals.add(nessie);

    String string1 = "apple";
    String string2 = "app" + "le"; //---> 3 stringet hoz létre, az első,második, és az összefűzött helyei létrejönnek

    System.out.println(dorka==dorka2);//false ,mert memóriahelyet néz, .equals nem.
    System.out.println(dorka.equals(dorka2)); //felülírtuk egy funkcióval

    feedAnimals(animals);
    //----------------------------------------------------------------------------------------------------------------------
    int[] numbers = new int[] {1,2,1,3,4,2,5,5};

    int[] unix = filterUniques(numbers);
    filterUniques(numbers);
  }

  private static void feedAnimals(List<Animal> animals) {
    for (Animal animal:animals) {
        animal.eat();
    }
  }

  private static int[] filterUniques(int[] numbers) {
    int[] uniqueCollector = new int[numbers.length];
    int numberOfUniques = 0;

    for (int i = 0; i <numbers.length ; i++) {
      if (!alreadyContains(uniqueCollector,numbers[i])){
        uniqueCollector[numberOfUniques]= numbers[i];
        numberOfUniques++;
      }
    }

    int[] uniques = copyNElement(uniqueCollector,numberOfUniques);

    return uniques ;
  }

  private static int[] copyNElement(int[] uniqueCollector, int numberOfUniques) {
    int[]uniques = new int [numberOfUniques];
    for (int i = 0; i <numberOfUniques ; i++) {
      uniques[i] = numberOfUniques;

    }
    return  uniqueCollector;
  }

  private static boolean alreadyContains(int[] uniqueCollector, int number) {
    for (int i = 0; i <uniqueCollector.length ; i++) {
      if (uniqueCollector[i]== number){
        return true;
      }
    }
    return false;
  }
}
