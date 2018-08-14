import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class TryCatchFiles {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Give a file");
    String fileName = scanner.nextLine();
    Path path = Paths.get(fileName);
    File file = new File(fileName);//old way of opening file, but had to close it
    //Files.write("Bla");
    List<String> lines = null;

    try {
      lines = Files.readAllLines(path);
    }catch (IOException e) {
      e.printStackTrace();

    }finally { // in the old times : executes anyways. You have to close files!!!

    }
    for (String line: lines) {
      System.out.println(line);

    }
    }
  }

