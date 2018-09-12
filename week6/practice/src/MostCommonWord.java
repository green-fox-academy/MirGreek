import javafx.print.Collation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonWord {
  public static void main(String[] args) {
    String filename = "test.txt";
    List<String> wordList = new ArrayList<>();
    System.out.println(readAllLines(filename));

  }

  public static String readAllLines(String filename) {
    List<String> textsList = new ArrayList<>();
    int count = 0;
    Path tests = Paths.get(filename);
    try {
      textsList = Files.readAllLines(tests);
    } catch (IOException e) {
      System.out.println("Cannot read file! :(");
    }

    String textTostring = textsList.toString();
    String textReplaced = textTostring.replaceAll("[,.;]", "");
    String textReplaced2 = textReplaced.replaceAll("[']", " ");

    String[] wordsList = textReplaced2.split(" ");
    System.out.println(Arrays.toString(wordsList));

    HashMap<String, Integer> wordsMap = new HashMap<>();

    for (String word : wordsList) {
      if (!wordsMap.containsKey(word)) {
        wordsMap.put(word, 1);
      } else
        wordsMap.put(word, wordsMap.get(word) + 1);
    }
    System.out.println(wordsMap);

    int max = Collections.max(wordsMap.values());
    System.out.println(max);
    for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
      if (entry.getValue() == max) {
        return entry.getKey();
      }
    }
    return null;
  }


}
// Create a simple word counter function which returns the most common string (word) in a file.
// The function should take one argument which is the filename.
// When the argument provided and a file exists by the provided filename:
// count all words in the given file and print the most common
// ("cat", "CAT", "cat," "cat." are different words)
// Handle exception if the argument is not a file.
// For i.e.: getMostCommonWord("test.txt");
// Should return:
// In