import java.util.Scanner;

public class Summing {
  public static void main(String[] args) {
    System.out.println("Mondj egy számot, megmondom a faktoriáltját");
   Scanner factorNum = new Scanner(System.in);
    int number = factorNum.nextInt();
    factorialOfNum(number);
    System.out.println(factorialOfNum(number));
  }
  public static int factorialOfNum(int number){
    int barni = 1;
    for (int i = 1; i <=number ; i++) {
        barni = i*barni;

    }

    return barni;
  }


}

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial