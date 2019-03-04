import com.sun.corba.se.impl.ior.ObjectAdapterIdArray;
import com.sun.deploy.util.ArrayUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.parallelSetAll;

public class QuickSortPartOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int n = Integer.toString(numbers).length();
        char[] arrString = Integer.toString(numbers).toCharArray();
        int[] arr = new int[arrString.length];

        for (int i = 0; i < arrString.length; i++) {
            arr[i] =  (int)arrString[i]-48;
        }
        quickSort1(arr);
    }

    private static void quickSort1(int[] arr) {
        double b = arr.length;
        double middleArr = Math.floor(b / 2);
        int mid = (int) middleArr;
        List<Integer> right = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        System.out.println(mid);

        for (int i = 1; i < arr.length; i++) {
               if(arr[i] < arr[0]) {
                   right.add(arr[i]);
               } else {
                   left.add(arr[i]);
               }
        }
        System.out.println(left + " is left and right is " + right);
    }
}
