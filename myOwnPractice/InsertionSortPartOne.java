import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertionSortPartOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int n = Integer.toString(numbers).length();
        char[] arrString = Integer.toString(numbers).toCharArray();
        int[] arr = new int[arrString.length];

        for (int i = 0; i < arrString.length; i++) {
            arr[i] =  (int)arrString[i]-48;
        }
        insertionSort1(n,arr);
    }
    static void insertionSort1(int n, int[] arr) {
        int num = arr[arr.length-1];
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        arrList.remove(n-1);

        for(int i = arr.length-1; i >= 0;i--) {
            if(arr[i] > num) {
                arr[i+1]= arr[i];
                System.out.println(Arrays.toString(arr));
            } else if (arr[i] < num) {
                arr[i+1] = num;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
