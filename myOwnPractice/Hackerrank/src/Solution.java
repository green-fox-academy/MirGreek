import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        ArrayList<Integer> newAr = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            newAr.add(ar[i]);
        }
        Collections.sort(newAr);

        int numberOfBigCandles = 0;

        for (int i = 0; i < newAr.size(); i++) {


            }
            return 0;
        }




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
            System.out.println(ar[i]);
        }

        int result = birthdayCakeCandles(ar);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
