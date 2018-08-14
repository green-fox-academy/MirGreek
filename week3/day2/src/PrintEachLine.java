import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
      public static void main(String[] args) {
        try {
          Path myFilename = Paths.get("example.txt");
          List<String> myLines = Files.readAllLines(myFilename);
          //for (String line:myLines) {
            System.out.println(myLines);
          //}
        } catch (Exception e) {
          System.out.println(e);
          //e.printStackTrace();
        }
        }
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"


      }
