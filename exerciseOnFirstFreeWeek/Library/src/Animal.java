public class Animal extends AnimalFarm {
  String color;
  int legs;
  String name;
  int canEat;
  int stomac;
  String type;

  public void eat(int amount) {
    if (stomac <= amount) {
      while (canEat != stomac) {
        this.stomac++;
      }
        if (stomac==0){
          System.out.println(this.name + " says, " + "I'm hungry! Feed me!");
        } else if (amount < canEat){
          System.out.println(this.name + " says, " + " My stomac is filled with: " + amount + ", I'm still hungry!");
        } else System.out.println(this.name + " says, " + " My stomac is filled with: " + stomac + ", I'm (thank)full.");

    } else System.out.println(this.name + " says, " +"My stomac is full, don't feed more!");
  }

  public Animal(String name,int legs){
    this.legs = legs;
    this.name = name;
    this.stomac = 0;
  }
}
