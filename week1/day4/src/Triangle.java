import java.util.Scanner;

public class Triangle {
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
    while (i != numberOfStars+1) {
      String star = "*";
      java.lang.String counter = (star + star);
      System.out.println(counter);
      counter = counter + 1;
      i = i + 1;
    }
  }
}

