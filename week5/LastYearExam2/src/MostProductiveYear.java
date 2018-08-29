import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MostProductiveYear {
  public static void main(String[] args) {
    String studioName = "marvel";
    List<String> newLines = new ArrayList<>();
    List<String> myLines;
    String year = "";
    mostProductiveYear(studioName);
  }


  public static void mostProductiveYear(String studioName) {
    List<String> myLines = new ArrayList<>();
    List<String> newLines = new ArrayList<>();
    HashMap<String, Integer> yearCount = new HashMap<>();
    //HashMap<String, Integer> yearcCountNotEqual = new HashMap<>();

    String year = "";
    Path studio = Paths.get(studioName + ".txt");
    try {
      myLines = Files.readAllLines(studio);
      for (int i = 0; i < myLines.size(); i++) {
        newLines.add(myLines.get(i).split(",")[1]);
        //System.out.println( myLines.get(i).split(",")[1]);
      }
    } catch (Exception e) {
      System.out.println("I couldn't read file");
    }

    System.out.println(newLines);
    int sum = 0;


    for (String yearNum : newLines)  {
      if (!yearCount.containsKey(yearNum )){
        yearCount.put(yearNum ,1);
      } else{
        Integer temp = yearCount.get(yearNum);
        yearCount.put(yearNum, temp+1);
      }

      System.out.println(yearCount);
    }


    //System.out.println(yearCount);

  }

}

//if (Integer.parseInt(newLines.get(j))==Integer.parseInt(newLines.get(j)))


/**
 * Write a method that helps you find the most productive year for a film studio.
 * The method should take one argument, which is the name of the film studio.
 * The method should try to open the related data file named `studioname`.csv,
 * which is a comma separated file with 3 columns: name of the movie, release year, director
 * <p>
 * - If we do not have any data about the studio, the method should return an error message.
 * - If we have found data, the method should return an information message about the most productive year for that studio.
 * RETURN: MOST PRODUCTIVE YEAR
 * Examples:
 * <p>
 * If we call the method with 'marvel':
 * should return 'marvel has made the most movies in 2017.'
 * <p>
 * If we call the method with 'ghibli':
 * should print 'Cannot find studio, please try again later.'
 * <p>
 * Hint:
 * - You can find some example files in this folder (marvel.csv and paramount.csv)
 * - Most productive year: The year in which the studio has made the most movies.
 */

