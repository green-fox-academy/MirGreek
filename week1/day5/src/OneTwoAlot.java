import java.util.Scanner;

public class OneTwoAlot {
  public static void main(String[] args) {

// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
    Scanner input  = new Scanner(System.in);
    System.out.println("Írj be egy kis számot!");
    int numberYouGave = input.nextInt();

    if (numberYouGave<=0){
      System.out.println("Not enough!");
    } else if (numberYouGave == 1){
      System.out.println("One");
    } else if (numberYouGave == 2){
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }


  }
}
