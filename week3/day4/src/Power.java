import java.util.Scanner;

public class Power {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Scanner scanner2 = new Scanner(System.in);
    int p = scanner.nextInt();

    System.out.println(powerN(2,3));
  }
  static int powerN(int n, int p) {

    if(p == 0) {
      return 1;
    }else if (p == 1) {
      return n;
    }else

    return n*powerN(n,p-1);
  }
}
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).