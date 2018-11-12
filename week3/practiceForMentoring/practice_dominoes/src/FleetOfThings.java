public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing getMilk = new Thing("Get milk");
    Thing removeObstacles = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing eatLunch = new Thing("Eat lunch");
    eatLunch.complete();
    standUp.complete();
    

    fleet.add(getMilk);
    fleet.add(removeObstacles);
    fleet.add(standUp);
    fleet.add(eatLunch);

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}