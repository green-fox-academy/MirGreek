import java.util.Scanner;

public class Blacklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        draw(input);
        //drawSquare(input);
        drawStairs(input);
    }
    public  static void draw(int number) {

        for (int i = 0; i <number ; i++) {
            for (int j = 0; j <number ; j++) {
                if (j < i) {
                    System.out.print(" ");
                    System.out.print("*");
                }

            }
            System.out.println();
        }


        for (int i = 0; i <number ; i++) {
            for (int j = i; j <number ; j++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
     }
    }
    public static void drawSquare(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 || j == 0) {
                    System.out.print("%");
                } else System.out.print(" ");
            }
            System.out.println("%");
        }
    }

    public static void drawStairs(int number) {
        for (int i = 0; i <number ; i++) {
            for (int j = i; j <number ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}
