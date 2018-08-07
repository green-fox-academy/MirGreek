import java.util.Scanner;

public class StarTriangle {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
    int i = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Give a number!");
    int numberOfStars = input.nextInt();
    while (i != numberOfStars) {
      String star = "*";
      //java.lang.String counter = (star);
      System.out.println(star);
      i = i + 1;
    }
  }
}