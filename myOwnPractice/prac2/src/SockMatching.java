import java.util.HashMap;
import java.util.Scanner;

public class SockMatching {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arItems = scanner.nextLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            arr[i] = arItem;
        }
        matcher(arr,n);

    }
    public static void matcher(int[]arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int pair = 0;
        for (int i = 0; i < n; i++) {
            if (!map.keySet().contains(arr[i])){
                map.put(arr[i],1);
            } else map.put(arr[i],map.get(arr[i])+1);
        }
        System.out.println(map);

        for (Integer num:map.values()) {
            if (num % 2 == 0){
                pair+=(num/2);
            } else  if (num>=3){
                pair+=(num-1)/2;
            }
        }
        System.out.println(pair);

    }
}
