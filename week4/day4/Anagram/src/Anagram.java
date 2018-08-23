import java.util.ArrayList;

public class Anagram {
  public static void main(String[] args) {
    String a = "";
    String string1 = "string";
    String string2 = "grints";

    System.out.println(anagram());

  }
    public static boolean anagram(){
      ArrayList<Character> list = new ArrayList<>();
      ArrayList<Character> list2 = new ArrayList<>();

      String string1 = "string";
      String string2 = "grints";


      for (int i = 0; i < string1.length(); i++) {
         list.add(string1.charAt(i)) ;

      }
      for (int j = 0; j < string2.length(); j++) {
        list2.add(string1.charAt(j)) ;
        }
         // if (list.containsAll(list2)){
           // System.out.println("anagram");
          //}else System.out.println("not anagram");
            return list.containsAll(list2);
      }

    }


