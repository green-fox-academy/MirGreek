import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EndsWithS {

  String filename;

  public int endsWithS(String filename){
    String tempString= "";
    String[] tempLine =new String[0];
    List<String> lines =new ArrayList<>();  //WE NEED: a list,
    List<String> words =new ArrayList();
    Path base = Paths.get(filename);    // the filename,
      try {
        lines =Files.readAllLines(base) ;    //readAllines function with TRY CATCH
      } catch (IOException e) {
        e.printStackTrace();
        System.out.println("File cannot be read!");
      }

    for (String line:lines) {
      tempString = line.replace(","," ");  //need a for loop to replace the írásjel with space and a temp string to save them
      tempString = tempString.replace("."," ");
      tempString = tempString.replace(";"," ");
      tempString = tempString.replace(":"," ");
      tempString = tempString.replace(" "," ");
      tempLine = tempString.split(" ");  // need to split by space to have the words, and an array[]!!!


    }
    for (int i = 0; i <tempLine.length ; i++) {
      if (tempLine[i].endsWith("s")){
        words.add(tempLine[i]);
      }
    }

    int numberOfWordS = words.size();
    System.out.println(numberOfWordS);
    return numberOfWordS ;
  }
  public EndsWithS(){
      filename = "base.txt";
  }
}
