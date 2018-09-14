import java.util.ArrayList;

public class Ship {
  ArrayList<Pirate> crew;
  int numberOfPirates;

  public Ship() {
    crew = new ArrayList<>();
  }

  public String fillShip(Pirate captain, Pirate pirate) {
    numberOfPirates = (int) (Math.random() * 10);
    crew.add(captain);
    for (int i = 0; i < numberOfPirates; i++) {
      crew.add(pirate);
    }

    return captain.name + " is the captain here";
  }


  @Override
  public String toString() {
    String statusOfCrew = "";
    int isAliveCounter = 0;
    int allRumDrankByShip = 0;
    for (Pirate pirate : crew) {
      if (pirate.isAlive) {
        isAliveCounter++;
      }
      allRumDrankByShip += pirate.drinkCount;
      if( pirate.type.equals("captain"){
    }

    statusOfCrew = "The pirates consumed "+ allRumDrankByShip + " rum, and " + isAliveCounter + " pirates are alive.";

    return statusOfCrew;
  }
}





