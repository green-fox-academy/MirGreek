public class Pirate {
  public static void main(String[] args) {
    String answer = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    String drink = "Pour me anudder!";
    boolean pirateDies = false;
    int chance = ((int)(Math.random() *10)/3);

    System.out.println(howsItGoingMate(answer, drink, Boolean.parseBoolean("alive")));

    brawl(chance, pirateDies);
  }
  public static String drinkSomeRum(String drink,boolean pirateDies){
    if (pirateDies){
      die();
    }
    return drink;

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
  public static String die(){
    String death = "He's dead";
    return death;
  }


  static String brawl(int chance, boolean pirateDies){
    chance = ((int)(Math.random() *10)/3);
    if (pirateDies){
      die();
    }
      if (chance == 1){
        return  "Pirate1 died :(";
      } else if (chance == 2){
        return "Pirate2 died :(";
      } else
      return "Both survived";
    }


    public static String parrot(){
      System.out.println("paa");
      return "paa";
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