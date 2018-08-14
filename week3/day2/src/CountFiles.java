import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountFiles {
  public static void main(String[] args) {
 takeFilename();

  }
  static int takeFilename()  {
    int mySize=0;
    try {
      Path myFile = Paths.get("example.txt");
      List<String> myLines = Files.readAllLines(myFile);
      mySize = myLines.size();
      System.out.println(mySize);
    } catch (Exception e){
      System.out.println(0);
    }

    return mySize;
  }

}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.