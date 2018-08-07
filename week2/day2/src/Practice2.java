import java.util.ArrayList;
import java.util.Scanner;
public class Practice2 {
  public static void main(String[] args) {
    System.out.println("Hány csillagból szeretnél háromszöget?");
    Scanner input = new Scanner(System.in);
    int myStarNum =  input.nextInt();
        int rows = myStarNum;

        for(int i = 1; i <= rows; ++i) {
          for(int j = 1; j <= i; ++j) {
            System.out.print("* ");
          }
          System.out.println();
        }
      }
    }


