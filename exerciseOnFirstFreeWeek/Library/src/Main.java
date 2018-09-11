

public class Main {
  public static void main(String[] args) {

    Animal animal = new Animal("állatka",4);
    animal.eat(3);
    Cow kistehen = new Cow("Kistehén",4);
    kistehen.eat(4);

    Horse horse = new Horse("Virág",4,"pej");
    horse.eat(7);
    horse.addAnimal(horse);
    Dog nessie = new Dog("Nessie",4);
    nessie.addAnimal(nessie);
    nessie.eat(2);
    nessie.eat(1);

    Person kamo = new Kamo("Kamo");
    System.out.println(kamo.name);

    Person mir = new Mir();
    System.out.println(mir.name);

    mir.adoptAnimal(new Animal("Okoskutya",4));
    mir.adoptAnimal(horse);
    kamo.adoptAnimal(nessie);
    kamo.adoptAnimal(animal);
    mir.adoptAnimal(nessie);
    mir.adoptAnimal(animal);
    AnimalFarm animalFarm = new AnimalFarm();
    animalFarm.feed(10);


  }
}
