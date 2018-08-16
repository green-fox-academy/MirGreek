import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    System.out.println("Írj be egy számot");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    counter(n);
  }
  static int counter(int n){
    //for (int i = n; i > 0 ; i--) {
      //System.out.println(i);
    //}
    if (n == 0) {
      return n;
    } else n--;
    System.out.println(n);

    return ( counter(n));
  }
}
// Write a recursive function that takes one parameter: n and counts down from n.
/*
public static int function(int n) {
  if (n == 1) {
    return 1;
  } else {
    return n * function(n - 1);
  }
}
 */