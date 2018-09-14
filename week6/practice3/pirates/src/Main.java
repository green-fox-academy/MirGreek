public class Main {
  public static void main(String[] args) {
    Pirate pirate = new Pirate("Jack Sparrow");
    Pirate otherPirate = new Pirate("Cheater");
    pirate.howsItGoingMate();

    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.drinkSomeRum();
    pirate.howsItGoingMate();

    pirate.brawl(otherPirate);

    Ship ship = new Ship();
    Pirate captain2 = new Captain("Captain Jack");
    Captain captain = new Captain("Captain Joe");
    ship.fillShip(captain,pirate);

  }
}
