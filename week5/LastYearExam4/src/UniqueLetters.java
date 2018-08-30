import java.util.ArrayList;

public class UniqueLetters {
  public static void main(String[] args) {
    String aParameter = "blablabla";
    uniqueCharacters(aParameter);

  }
  public static void uniqueCharacters(String parameter){
    ArrayList<Character> uniqum =new ArrayList<>();
   parameter="cat";
   parameter.toCharArray();
   parameter.split("");

    for (int i = 0; i < parameter.length(); i++) {
     char temp= parameter.charAt(i);
      uniqum.add(temp);
    }
    System.out.println(uniqum);
    //return ;
  }

  String str = "cat";
  char[] cArray = str.toCharArray();
}

//// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases System.out.println(uniqueCharacters("anagram"));
// Should print out:
// ["n", "g", "r", "m"]