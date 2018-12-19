import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        System.out.println(getWordNumber(string));

    }
    public static int getWordNumber(String s){
        char[] chars = s.toCharArray();
        int numberOfWord = 0;

        for (int i = 0; i <chars.length ; i++) {
           if (!Character.isLowerCase(chars[i])){
               numberOfWord++;
           }
        }
        return numberOfWord+1;
    }
}
