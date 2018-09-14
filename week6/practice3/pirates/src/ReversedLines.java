import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    String filename = "reversed.txt";

    getTextLines(filename);
    System.out.println(reverser(filename));
  }

  private static String reverser(String filename) {
    List<String> lineList = getTextLines(filename);
    List<Character> characterReversed = new ArrayList<>();

    for (int j = 0; j < lineList.size(); j++) {
      char[] charList = lineList.get(j).toCharArray();
      for (int i = charList.length - 1; i >= 0; i--) {
        characterReversed.add(charList[i]);
      }
    }

    StringBuilder builder = new StringBuilder();
    for (Character c : characterReversed) {
      builder.append(c);
    }

    return builder.toString();
  }

  public static List<String> getTextLines(String filename) {
    List<String> lineList = new ArrayList<>();
    Path file = Paths.get(filename);
    try {
      lineList = Files.readAllLines(file);
    } catch (IOException e) {
      System.out.println("Cannot read file!");
    }
    return lineList;
  }


}
