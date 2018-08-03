import java.util.Scanner;
public class AnimalsAndLegs {

  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner input1  = new Scanner(System.in);
    Scanner input2  = new Scanner(System.in);
    System.out.println("Hány csirke van a farmon?");
    System.out.println("Hány malac van a farmon?");
    int chicNum = input1.nextInt();
    int pigNum = input2.nextInt();
    System.out.println(chicNum*2 + pigNum*4);

  }
}
