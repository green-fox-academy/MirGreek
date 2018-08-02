import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    System.out.println("What is your name?");
    String myInputBox = input.next();
    System.out.println( " Oh, so your name is " + myInputBox);
  }
}
