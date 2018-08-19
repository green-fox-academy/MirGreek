public class Pirate {
  public static void main(String[] args) {
    String answer = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    String drink = "Pour me anudder!";

    System.out.println(howsItGoingMate(answer, drink));
  }
  public static void drinkSomeRum(String drink2){

    System.out.println(drink2);
  }
  public static String howsItGoingMate(String answer,String drink){
    for (int i = 0; i <4 ; i++) {
         drinkSomeRum(drink);
        }

    return answer;
  }
  static void die(){
    System.out.println("He's dead");
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