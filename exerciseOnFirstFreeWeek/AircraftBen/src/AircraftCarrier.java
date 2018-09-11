import java.util.ArrayList;
import java.util.EmptyStackException;

public class AircraftCarrier {
  ArrayList<AircraftRebuilded> carrier;                 //The carrier should be able to store aircrafts
  int ammoOfCarrier;
  int hp;

  public AircraftCarrier(int ammoOfCarrier, int hp) {  //The initial ammo should be given by a parameter in it's constructor
    carrier = new ArrayList<>();                       //The carrier also has a health point given in it's constructor as well
    this.ammoOfCarrier = ammoOfCarrier;
    this.hp = hp;
  }

  public void add(AircraftRebuilded aircraft) {       //It should take a new aircraft and add it to its store
    carrier.add(aircraft);
  }

  public void refill() {
    if (ammoNeededByAircrafts() < ammoOfCarrier) {
      for (int i = 0; i < carrier.size(); i++) {
        ammoOfCarrier = carrier.get(i).refill(ammoOfCarrier);     //It should fill all the aircraft with ammo and substract the needed ammo from the ammo storage
      }
    } else if (ammoOfCarrier == 0) {                              //If there is no ammo when this method is called it should throw an exception
      throw new EmptyStackException();
    } else {
      for (int i = 0; i < carrier.size(); i++) {                  //If there is not enough ammo than it should start to fill the aircrafts with priority first
        if (carrier.get(i).isPriority()) {
          ammoOfCarrier = carrier.get(i).refill(ammoOfCarrier);
        }
      }
      for (int j = 0; j < carrier.size(); j++) {
        if (!carrier.get(j).isPriority()) {
          ammoOfCarrier = carrier.get(j).refill(ammoOfCarrier);
        }
      }
    }
  }

  public int ammoNeededByAircrafts() {                          //Check the ammo needed for the carrier (total aircrafts)
    int ammoCounter = 0;
    for (int i = 0; i < carrier.size(); i++) {
      ammoCounter += carrier.get(i).maxAmmo - carrier.get(i).ammoStore;
    }
    return ammoCounter;
  }

  public void carrierFight(AircraftCarrier enemyCarrier) {      //It should take another carrier as a refrence parameter
    enemyCarrier.hp -= fightAndSetAmmoNull();                   // and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
    if (enemyCarrier.hp <= 0) {
      System.out.println("It's dead Jim :(");
    }
  }

  public int fightAndSetAmmoNull() {
    for (int i = 0; i < carrier.size() ; i++) {               // innentől a következő három sor nullázza a carrier ammo-ját
      carrier.get(i).fight();
    }
    return totalDamage();                                     //  return the total damages of the carrier
  }

  public int totalDamage() {
    int damageCounter = 0;
    for (int i = 0; i < carrier.size() ; i++) {
      damageCounter += carrier.get(i).getAllDamage();
    }
    return damageCounter;
  }

  public void getStatus() {                                      //It should give back a string about it's and all of its aircrafts status like:
    System.out.println("HP: " + hp + ", Aircraft Count: " + carrier.size() + ", Ammo Storage: " + ammoOfCarrier + ", Total Damage: " +
        totalDamage());
    System.out.println("Aircrafts:");
    for (int i = 0; i < carrier.size(); i++) {
      System.out.println(carrier.get(i).getStatus());
    }
  }
}
