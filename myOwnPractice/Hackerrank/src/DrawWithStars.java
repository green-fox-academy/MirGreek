import java.util.Scanner;

public class DrawWithStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        drawSquare(number);

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
    }

