import java.util.ArrayList;
import java.util.List;

public class Player {
  String name;
  List<Die> dice;

  public Player(String name, List<Die> dice) {
    this.name = name;
    this.dice = dice;
  }

  public Player() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Die> getDice() {
    return dice;
  }

  public void setDice(List<Die> dice) {
    this.setDice(dice);
  }

  public void giveDice(){
    this.setDice(getHand());
  }

  public List<Die> getHand(){
    List<Die> hand = new ArrayList<>();
    Die die = new Die();
    Die die2 = new Die();
    Die die3 = new Die();
    Die die4 = new Die();
    Die die5 = new Die();

    die.setValue((int) (Math.random() * 6) + 1);
    die2.setValue((int) (Math.random() * 6) + 1);
    die3.setValue((int) (Math.random() * 6) + 1);
    die4.setValue((int) (Math.random() * 6) + 1);
    die5.setValue((int) (Math.random() * 6) + 1);

    hand.add(die);
    hand.add(die2);
    hand.add(die3);
    hand.add(die4);
    hand.add(die5);
    return hand;
  }

}
