import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String original) {
        int hunTime = 0;
       String[] splittedTime = original.split(":");
       String firstPart = splittedTime[0];
        int originalTime =  Integer.parseInt(firstPart);

        if (splittedTime[2].contains("PM")) {
               if (originalTime!=12) {
                   hunTime = originalTime + 12;
               } else return "00:" + splittedTime[1] + ":" + splittedTime[2].substring(0,2);
        }

        return String.valueOf(hunTime) + ":" + splittedTime[1] + ":" + splittedTime[2].substring(0,2);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

 //       bw.write(result);
   //     bw.newLine();

     //   bw.close();

    }
}
