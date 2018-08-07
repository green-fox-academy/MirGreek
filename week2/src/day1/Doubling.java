//import java.util.Scanner;


public class Doubling {

  public static void main(String[] args) {
    int baseNum = 123;
    doublingFunction(baseNum);
    //Scanner input = new Scanner(System.in);
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
    System.out.println(doublingFunction(baseNum));

  }
  public static int doublingFunction(int number){
    return number*2;
  }
}


