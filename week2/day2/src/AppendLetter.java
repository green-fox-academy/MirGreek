import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {

    public static void main(String... args){
      List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
      ArrayList<String> appendA = new ArrayList<>();
      // Create a method called "appendA()" that adds "a" to every string in the "far" list.
      // The parameter should be a list.
      for (int i = 0; i <far.size() ; i++) {
        appendA.add(far.get(i)+"a");
      }

      System.out.println(appendA);
    }
  }

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"

