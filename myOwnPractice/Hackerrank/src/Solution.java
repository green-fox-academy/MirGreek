import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        List<Integer> newAr = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            newAr.add(ar[i]);
        }
        Collections.sort(newAr);

        int numberOfBigCandles = 0;

        HashMap<Integer,Integer> countingMap = new HashMap<>();

        for (int i = 0; i < newAr.size(); i++) {
            if (!countingMap.containsKey(newAr.get(i)) ) {
                countingMap.put(newAr.get(i), 1);
            } else countingMap.put(newAr.get(i), countingMap.get(newAr.get(i)) + 1);
        }

        List<Integer> list = new ArrayList<>(countingMap.values());
            Collections.sort(list);
        System.out.println(Collections.max(list));

        return Collections.max(list);
        }





    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        char[] arItemsChar = arItems[0].toCharArray();
        int[] array = new int[arCount];
        for (int i = 0; i <arCount ; i++) {
             array[i] = Character.digit(arItemsChar[i],arCount);

        }
        //int[] array = Arrays.stream(arItems).mapToInt(Integer::parseInt).toArray();
        System.out.println(array[0]);

        birthdayCakeCandles(array);
    }
}