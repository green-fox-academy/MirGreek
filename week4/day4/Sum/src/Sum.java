import java.util.ArrayList;

public class Sum {

  ArrayList<Integer> numbers = new ArrayList<>();

  public int sumMethod() {
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum = sum + numbers.get(i);
    }

    return sum;
  }
  public void elements(int num) {
    numbers.add(num);
  }

}
