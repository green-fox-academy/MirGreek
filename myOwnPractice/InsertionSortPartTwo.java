import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertionSortPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int n = Integer.toString(numbers).length();
        char[] arrString = Integer.toString(numbers).toCharArray();
        int[] arr = new int[arrString.length];

        for (int i = 0; i < arrString.length; i++) {
            arr[i] =  (int)arrString[i]-48;
        }
        insertionSort(n,arr);
    }
    static void insertionSort(int n, int[] arr) {
        int temp = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 1; i < n; i++) {
                if(arr[i-1] > arr[i]) {
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }



    }
}
