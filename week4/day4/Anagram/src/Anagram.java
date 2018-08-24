import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Anagram {
  public static void main(String[] args) {

    String string1 = "bármi";
    String string2 = "bárki";

    anagram(string1, string2);

  }
    public static boolean anagram(String string1, String string2){
      ArrayList<Character> list = new ArrayList<>();
      ArrayList<Character> list2 = new ArrayList<>();

      for (int i = 0; i < string1.length(); i++) {
         list.add(string1.charAt(i)) ;

      }
      for (int j = 0; j < string2.length(); j++) {
        list2.add(string2.charAt(j)) ;
        }
        Collections.sort(list);
        Collections.sort(list2);

         // if (list.containsAll(list2)){
           // System.out.println("anagram");
          //}else System.out.println("not anagram");
            return (list.equals(list2));
      }

    }


