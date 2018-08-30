import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class UniqueLetters {
  public static void main(String[] args) {
    String aParameter = "elkáposztásítottalanítottátok";
    System.out.println(uniqueCharacters(aParameter));

  }
  public static ArrayList<Character> uniqueCharacters(String parameter){
    ArrayList<Character> uniqum =new ArrayList<>();
    HashMap<Character,Integer> uniqumNext = new HashMap<>();
    ArrayList<Character> uniqueLetters =new ArrayList<>(uniqumNext.keySet());

    for (int i = 0; i < parameter.length(); i++) {
     char temp= parameter.charAt(i);
      uniqum.add(temp);
      //System.out.println(uniqum.size());
    }

    for (Character letter : uniqum) {
      if (!uniqumNext.containsKey(letter)){
        uniqumNext.put(letter,1);
      }
    }

    uniqueLetters.addAll(uniqumNext.keySet());


    return uniqueLetters ;
  }

}

//// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases System.out.println(uniqueCharacters("anagram"));
// Should print out:
// ["n", "g", "r", "m"]


/* Számozással:
 for (Character letter : uniqum) {
      if (!uniqumNext.containsKey(letter)){
        uniqumNext.put(letter,1);
        //System.out.println(uniqumNext.get(uniqum.get(letter)));
      } else {
        Integer temp = uniqumNext.get(letter);
        uniqumNext.put(letter, temp + 1);
      }
    }
    //System.out.println(uniqum);
    //return ;
 */