import java.util.ArrayList;
import java.util.Arrays;

public class Exercise5 {
  public static void main(String[] args) {

    String myString = "thisIsAString";

    uppercase(myString);
  }
  //Write a Stream Expression to find the uppercase characters in a string!
  private static String uppercase(String myString) {
    myString.chars()
        .filter(s -> Character.isUpperCase(s))
        .mapToObj(s -> Character.toString((char) s))
        .forEach(System.out::println);
    return "";
  }


}
