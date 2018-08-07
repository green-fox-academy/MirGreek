import java.util.Scanner;

public class PrintParams {
  public static void main(String[] args) {
    System.out.println("Mondj valamit");
    Scanner input = new Scanner(System.in);
    String words = input.nextLine();
    printParams(words);
    System.out.println(printParams(words));
  }

  public static String printParams(String words) {
    return words;

  }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

