import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class Logs {
  public static void main(String[] args) throws IOException {
    Path logTxt = Paths.get("log.txt");
    List<String> myLines = Files.readAllLines(logTxt);
    List<String> newLines = new ArrayList<>();

    IPad(myLines, newLines);
    rate(myLines, newLines);


    //read the lines, put them into arraylist, split the lines by spaces, return them in function, try catch them
  }

  static void IPad(List<String> myLines, List<String> newLines) {
    for (int i = 0; i < myLines.size(); i++) {
      newLines = Arrays.asList(myLines.get(i).split("   ")[1]);
      System.out.println(newLines);
    }

  }

  static void rate(List<String> myLines, List<String> newLines) {
    int getIT = 0;
    int getPOST = 0;
    double myRatio = 0;
    for (int i = 0; i < myLines.size(); i++) {
      if (Arrays.asList(myLines.get(i).split("   ")[2]).contains("GET")) {
        getIT = getIT + 1;
      }
    }
    for (int j = 0; j < myLines.size(); j++) {
      if ((Arrays.asList(myLines.get(j).split("   ")[2])).contains("POST")) {
        getPOST = getPOST + 1;
      }
    }
    try {
      myRatio = getIT / getPOST;
    } catch (ArithmeticException e) {
      System.out.println("Divided by zero");
    }
    System.out.println(getPOST);


  }
}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.