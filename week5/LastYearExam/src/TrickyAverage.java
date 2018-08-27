import java.util.ArrayList;
import java.util.Arrays;

public class TrickyAverage {
  public static void main(String[] args) {
    int[] array = {2, 3, 4, 5, 6, 7, 9, 10, 12};
    double average = 0.0;
    getTrickyAvg(array, average);

  }

  public static double getTrickyAvg(int[] array,double average) {
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        odd.add(array[i]);
      } else even.add(array[i]);
    }

    double tempEven = 0.0;
    for (int k = 0; k <even.size() ; k++) {
          tempEven=even.get(k);
        }

    double tempOdd = 0.0;
    for (int i = odd.size()-1; i > -1 ; i--) {
         tempOdd = odd.get(i);
      }
    average= tempOdd/tempEven;
    System.out.println(tempEven);
    System.out.println(tempOdd);
    System.out.println(average);
     return average;

  }
}

  /**
   * Create and test a function called `getTrickyAvg` that takes a number array (only integers) as parameter
   * and returns the average of the smallest odd and largest even.
   *  - use only basic control flow statements, like 'for', 'if', etc.
   *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
   *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
   *
   * Example cases:
   * [1, 2, 3] -> should return 1.5
   * [3, 4, 5, 6] -> should return 4.5
   * [5, 2, 8, -1] -> should return 3.5
   */

