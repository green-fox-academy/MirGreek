import java.util.Scanner;

public class SubStringSearcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        System.out.println(subStringCounter(firstString, secondString));

    }
    public static int subStringCounter(String first,String second){
      char[] firstChars =  first.toCharArray();
      char[] secondChars =  second.toCharArray();
      int counter = 0;

        for (int i = 0; i <firstChars.length ; i++) {
            for (int j = 0; j <secondChars.length ; j++) {
                if(firstChars[i]==secondChars[j]) {
                    counter++;
                }
            }
        }
        if (counter == 0) {
            return -1;
        } else
        return counter;

    }
}
