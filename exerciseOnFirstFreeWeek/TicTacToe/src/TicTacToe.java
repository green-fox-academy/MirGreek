import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  private static String ticTacResult(String s) {
    Path file = Paths.get(s);
    List<String> drawing = new ArrayList<>();
    try {
      drawing = Files.readAllLines(file);
    } catch (IOException e) {
      e.printStackTrace();
    }


    System.out.println(drawing);
    List<Character> characters = new ArrayList<>();

    /*for (int j = 0; j < drawing.size(); j++) {
      for (int i = 0; i < drawing.size(); i++) {
        char[] temp = drawing.get(j).toCharArray();
        characters.add(temp[i]);
      }
    }*/
    //System.out.println(characters);
    for (int i = 0; i <drawing.size() ; i++) {
      drawing.get(i).split(",");
      char[] temp = drawing.get(i).toCharArray();
      characters.add(temp[i]);
    }
    System.out.println(drawing);


    return "";
  }
}
