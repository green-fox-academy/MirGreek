import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {

    Path path = Paths.get("example.txt");
    Scanner scanner = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    String word = scanner.nextLine();

    int number = input.nextInt();

    //System.out.println(word + number);
    paramChanger(path, word, number);
  }


  static void paramChanger(Path path, String word, int number) {

    ArrayList<String> lines = new ArrayList();
    for (int i = 0; i < number; i++) {
      lines.add(word);
    }
    try {
      Files.write(path, lines);
    } catch (Exception e) {

    }

  }
}



// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
