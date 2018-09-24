import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {


            List<String> charOfWordA = Arrays.asList(a.split(""));
            List<String> charOfWordB = Arrays.asList(b.split(""));

            Collections.sort(charOfWordA);
            Collections.sort(charOfWordB);

            if (charOfWordA.equals(charOfWordB)) {
                return true;
            }
            return false;
        }
    }
}
