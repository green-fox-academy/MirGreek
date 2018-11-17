import java.util.ArrayList;
import java.util.List;

public class Die {
  int value;

  public Die(int value) {
    this.value = value;
  }

  public Die() {
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int roll() {
    Die die = new Die();
    die.setValue((int) (Math.random() * 6) + 1);
    return die.getValue();
  }



}
