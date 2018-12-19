import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int number = scanner.nextInt();
        repeatedString(string,number);
    }
    static long repeatedString(String s, long n) {
        StringBuilder builder = new StringBuilder();
        List<Character> mChars = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < n ; i++) {
            builder.append(s);
        }

        char[] builderInChar = builder.toString().toCharArray();

        for (int i = 0; i <n ; i++) {
            mChars.add(builderInChar[i]);
        }

        for (int i = 0; i <mChars.size(); i++) {
            if (mChars.get(i).equals('a')){
                counter++;
            }
        }
        System.out.println(counter);

        return counter;
    }
}
