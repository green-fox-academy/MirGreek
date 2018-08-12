import java.util.ArrayList;
import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Please enter numbers and say ok, when finished");
    //int[] numbers = new int[0];
    while (input.hasNextInt()){
      numbers.add(input.nextInt());
    }
    System.out.println(numbers);
      //int[] number25;
    //number25 = new int[numbers.size()];


    myFunctionSum(numbers);
    myFunctionAverage(numbers);
    System.out.println("The average: " + myFunctionAverage(numbers));
    System.out.println("The the sum: " + myFunctionSum(numbers));
  }



  static int myFunctionSum(ArrayList numbers) {
    int sumAll = 0;
    for (int i = 0; i <numbers.size() ; i++) {
      sumAll += (int) (numbers.get(i));
    }
    return sumAll;
  }
  static double myFunctionAverage(ArrayList numbers){

    double averageAll = 0;
    for (int i = 0; i <numbers.size() ; i++) {
      averageAll =averageAll + (int) (numbers.get(i));
    }

    return (averageAll/numbers.size());
  }
}


// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4