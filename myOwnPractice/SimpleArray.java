import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleArray {
    public static void main(String[] args) {
        int[] myArray = {4,2,3,1};
        System.out.println(isListFull(myArray));

    }
    public static boolean isListFull(int[] myArray){
        boolean temp = false;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            list.add( myArray[i]);
        }

        Arrays.sort(myArray);
        Collections.sort(list);
        System.out.println(myArray[0]);
        for (int i = 1; i < myArray.length; i++) {
            if(myArray[i-1]+1==myArray[i]) {
                temp = true;
            } else temp = false;
        }
        return temp;
    }
}
