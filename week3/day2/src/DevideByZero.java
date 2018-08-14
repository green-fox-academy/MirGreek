import java.util.Scanner;

public class DevideByZero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int  number = input.nextInt();
    divisibleByZero(number);
  }
  static void divisibleByZero(int number) {
    int devider = 10;
    try {
      devider = 10/number;
    } catch (ArithmeticException except) {
      System.out.println("FAIL!");
    }
    System.out.println(devider);
  }
}


// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0