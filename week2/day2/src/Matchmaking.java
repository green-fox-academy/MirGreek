import java.util.HashMap;
import java.util.ArrayList;
  import java.util.Arrays;

  public class Matchmaking{
    public static void main(String... args){
      ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
      ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
      ArrayList<String> girlsAndBoys = new ArrayList<>();
      //HashMap girlsAndBoys = new HashMap();
      // Write a method that joins the two lists by matching one girl with one boy into a new list
      // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
      for (int i = 0; i <girls.size(); i++) {
        girlsAndBoys.add(girls.get(i));
        girlsAndBoys.add(boys.get(i));



      }

      System.out.println(girlsAndBoys);

      //System.out.println(makingMatches(girls, boys));
    }
  }

