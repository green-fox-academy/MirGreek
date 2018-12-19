import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Guess the number I have! :)");
        int number = (int) (Math.random()*10);
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        System.out.println(guesser(number, guess));
        if ( guess!=number) {
            int guess2=0;
            while (guess2!=number){
                guess2 = scanner.nextInt();
                System.out.println(guesser(number, guess2));
            }

        }

    }
    public static String guesser(int number, int guess) {
        if (guess > number) {
            return  "The number is smaller!";
        } else if (guess < number) {
            return  "The number is greater!";
        } else return "You got it! :D";
    }
}
