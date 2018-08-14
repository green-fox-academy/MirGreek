import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) throws IOException {
      try {
        Path myFile = Paths.get("example.txt");
        Files.write(myFile, Collections.singleton("Görög Mirjam"));
      } catch (Exception e){
        System.out.println("Unable to write file: example.txt");
      }


      // Open a file called "my-file.txt"
      // Write your name in it as a single line
      // If the program is unable to write the file,
      // then it should print an error message like: "Unable to write file: my-file.txt"


    }
  }

