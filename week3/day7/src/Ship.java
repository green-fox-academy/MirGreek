
import java.util.ArrayList;

public class Ship {
  public static void main(String[] args) {

    ArrayList<Pirate> crew =new ArrayList<>();

    fillShip(crew);

    System.out.println();
  //fillShip(captain, pirateNum,);

  }
  public static void fillShip(ArrayList crew){
    Pirate captain = new Pirate();
    Pirate pirate = new Pirate();
    int pirateNum = (int) (Math.random()* 100);
    crew.add(captain);
    for (int i = 0; i <pirateNum ; i++) {
      crew.add(pirate);
    }

    System.out.println(pirateNum);
  }
}
/*
The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
When a ship is created it doesn't have a crew or a captain
The ship can be filled with pirates and a captain via fillShip() method.
Filling the ship with a captain and random number of pirates.
Ships should be represented: captains consumed rum, state (passed out / died)
number of alive pirates in the crew
 */