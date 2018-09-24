import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        } else {

            String uppercaseA= a.toUpperCase();
            String uppercaseB= b.toUpperCase();

            List<String> charOfWordA = Arrays.asList(uppercaseA.split(""));
            List<String> charOfWordB = Arrays.asList(uppercaseB.split(""));

            Collections.sort(charOfWordA);
            Collections.sort(charOfWordB);

            if (charOfWordA.equals(charOfWordB)) {
                return true;
            }
            return false;
        }
    }
}
