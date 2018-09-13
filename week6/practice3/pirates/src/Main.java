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
  }
}
