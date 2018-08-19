public class Pirate {
  public static void main(String[] args) {
    String answer = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    String drink = "Pour me anudder!";
    boolean pirateDies = false;
    int chance = ((int)(Math.random() *10)/3);
    System.out.println(chance);
    System.out.println(howsItGoingMate(answer, drink,Boolean.parseBoolean("alive")));

    brawl(chance, pirateDies);
  }
  public static void drinkSomeRum(String drink2,boolean pirateDies){
    if (pirateDies){
      die();
    }
    System.out.println(drink2);

  }
  public static String howsItGoingMate(String answer,String drink,boolean pirateDies){
    for (int i = 0; i <4 ; i++) {
      if (pirateDies){
        die();
      }
         drinkSomeRum(drink, Boolean.parseBoolean("alive"));

        }

    return answer;

  }
  static void die(){
    System.out.println("He's dead");
  }
  

  static void brawl(int chance, boolean pirateDies){

    chance = ((int)(Math.random() *10)/3);
    if (pirateDies){
      die();
    }
      if (chance == 1){
        System.out.println( "Pirate1 died :(");
      } else if (chance == 2){
        System.out.println("Pirate2 died :(");
      } else
      System.out.println("Both survived");
    }
}
/*
drinkSomeRum() - intoxicates the Pirate some
howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.

die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance,
 1 dies, the other dies or they both pass out.
 */