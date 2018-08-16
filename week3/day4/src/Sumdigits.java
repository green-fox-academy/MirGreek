import java.util.Scanner;

public class Sumdigits {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    System.out.println(adderFunction(n));

  }

  static int adderFunction(int n) {

    if (n / 10 == 0) {
      return n;
    } else
      return adderFunction((n / 10) + n % 10);


// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
  }
}
