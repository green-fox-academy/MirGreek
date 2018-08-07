import java.util.Scanner;
public class Startrangle {
  public static void main(String[] args) {
    System.out.println("Say a number!");
  Scanner input = new Scanner(System.in);
    int numStars = input.nextInt();
    for (int i = 0; i <numStars ; i++) {
      //System.out.println("*");
      if (i!=0){
        System.out.println("*");
      }
      for (int j = 0; j < numStars; j++) {
        System.out.print("*");

      }
    }
  }
}
