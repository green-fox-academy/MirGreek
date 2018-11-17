import java.util.*;
import java.util.stream.Collectors;

public class basicLogic {
  public static void main(String[] args) {
    Die die = new Die();
    Table table = new Table();
    List<Die> myHand = new ArrayList<>();
    Player player = new Player();

    myHand = player.getHand();
    //System.out.println(diceCount(player.getDice()));
    System.out.println(whatYouHaveInHand(myHand));

  }

  public static HashMap diceCounting(Player player, Table table) {
    List<Die> myHand = player.getHand();
    List<Die> tableDice = table.rollTableDiceFirst();
    List<Die> allDice = new ArrayList<>();
    allDice.add(myHand.get(0));
    allDice.add(myHand.get(1));
    allDice.add(myHand.get(2));
    allDice.add(tableDice.get(0));
    allDice.add(tableDice.get(1));
    allDice.add(tableDice.get(2));

    HashMap<Integer, Integer> diceMap = new HashMap<>();



    for (int i = 0; i < allDice.size(); i++) {
      if (!diceMap.containsKey(allDice.get(i).value)) {
        diceMap.put(allDice.get(i).value, 1);
      } else
        diceMap.put(allDice.get(i).value, diceMap.get(allDice.get(i).value) + 1);
    }


    for (int i = 0; i < myHand.size(); i++) {
      System.out.println(myHand.get(i).value + " Myhand");
    }

    for (int i = 0; i < tableDice.size(); i++) {
      System.out.println(tableDice.get(i).value + " table");
    }


    return diceMap;
  }

  public static HashMap diceCount(List<Die> myHand) {
    Die die = new Die();//should get only two lists of dice

    HashMap<Integer, Integer> diceMap = new HashMap<>();

    for (int i = 0; i < myHand.size(); i++) {
      if (!diceMap.containsKey(myHand.get(i).getValue())) {
        diceMap.put(myHand.get(i).getValue(), 1);
      } else
        diceMap.put(myHand.get(i).getValue(), diceMap.get(myHand.get(i).getValue()) + 1);
    }

    //for (int i = 0; i < myHand.size(); i++) {
      //System.out.println(myHand.get(i).value + " Myhand");
    //}
    return diceMap;
  }

  public static String whatYouHaveInHand(List<Die> myHand){
    System.out.println(diceCount(myHand));
    if (fiveDiceSame(myHand)){
      return "You have five dice the same.";
    } else if (poker(myHand)) {
      return "You have a poker.";
    } else if (threeDicesSame(myHand)){
      return "You have three dice the same";
    } else if (fullhouse(myHand)) {
      return "You have a fullhouse";
    }
   return "you have maybe one or two pairs?" ;
  }


  public static boolean fiveDiceSame(List<Die> myHand) {
    return diceCount(myHand).containsValue(5);
  }

  public static boolean poker(List<Die> myHand) {
     return diceCount(myHand).containsValue(4);
  }
  public static boolean threeDicesSame(List<Die> myHand) {
    return diceCount(myHand).containsValue(3) && !diceCount(myHand).containsValue(2);
  }

  public static boolean fullhouse(List<Die> myHand) {
   return diceCount(myHand).containsValue(3) && diceCount(myHand).containsValue(2);
  }
}
