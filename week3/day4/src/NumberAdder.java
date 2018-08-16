import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    int num = 0;
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(adderFunction(n));

  }

  static int adderFunction(int n) {
    //for (int i = n; i > 0 ; i--) {
    //System.out.println(i);
    //}

    if (n == 1) {
      return n;
    } else

    return (n +adderFunction(n-1));
  }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.