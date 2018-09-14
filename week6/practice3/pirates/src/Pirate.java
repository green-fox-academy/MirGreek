import java.util.Arrays;
import java.util.Random;

public class Pirate {
  boolean isDrunk;
  int drinkCount;
  boolean isAlive;
  String name;
  String type;

  public Pirate(String name,String type) {
    this.drinkCount = 0;
    this.isDrunk = false;
    this.isAlive = true;
    this.name = name;
    this.type = type;

  }


  public void drinkSomeRum() {
    if (isAlive = true) {
      isDrunk = true;
      drinkCount++;
    } else System.out.println("He's dead.");

  }

  public void howsItGoingMate() {
    if (isAlive = true) {
      if (isDrunk = true && drinkCount < 5) {
        System.out.println("Pour me anudder!");
      }else System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    } else System.out.println("He's dead.");
  }

  public void die() {
    this.isAlive = false;
  }

  public void brawl(Pirate otherPirate) {
    if (otherPirate.isAlive && this.isAlive) {
      if (chanceOfDying() == 0) {
        System.out.println(this.name + " and " + otherPirate.name + " are both alive.");
      } else if (chanceOfDying() == 1) {
        otherPirate.isAlive = false;
        System.out.println(this.name + " is alive, " + otherPirate.name + " is dead.");
      } else {
        this.isAlive = false;
        System.out.println(otherPirate.name + " is alive, " + this.name + " is dead.");
      }
    }

  }

  public int chanceOfDying() {
    int random = (int) (Math.random() * 3);
    return random;
  }
  public void parrot(){
    System.out.println("paa");
  }
  public String getStatus(){
    return this.type;
  }


}


