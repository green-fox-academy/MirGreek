import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Table {
  List<Die> dice;

  public Table(List<Die> dice) {
    this.dice = dice;
  }

  public Table() {
  }

  public List<Die> getDice() {
    return dice;
  }

  public void setDice(List<Die> dice) {
    this.dice = dice;
  }
  public List<Die> rollTableDiceFirst() {
    Die die = new Die();
    Die die2 = new Die();
    Die die3 = new Die();
    this.dice = new ArrayList<>();
       int value =   die.roll();
       die.setValue(value);
        int value2 =   die2.roll();
        die2.setValue(value2);
    int value3 =   die3.roll();
    die3.setValue(value3);
    dice.add(die);
    dice.add(die2);
    dice.add(die3);
    return dice;
  }
}
