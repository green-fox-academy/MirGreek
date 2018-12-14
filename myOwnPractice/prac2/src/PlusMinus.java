import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //int[] ar = new int[input];

        String[] arItems = scanner.nextLine().split(" ");
        char[] chars = arItems[0].toCharArray();
        int[] arr = new int[input];
        for (int i = 0; i <input ; i++) {
            arr[i] = Character.digit(chars[i],input);
        }

        plusMinus(arr);

    }

    static void plusMinus(int[] arr) {
        double positives = 0;
        double negatives = 0;
        double zeros = 0;
        double elements = arr.length;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > 0) {
                positives++;
            } else if (arr[i] < 0) {
                negatives++;
            } else zeros++;
        }
        System.out.println(positives/elements);
        System.out.println(negatives/elements);
        System.out.println(zeros/elements);
    }

}
