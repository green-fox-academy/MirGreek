import java.util.Scanner;
public class AnimalsAndLegs {

  public static void main(String[] args) {

    Scanner input1  = new Scanner(System.in);
    Scanner input2  = new Scanner(System.in);
    System.out.println("Hány csirke van a farmon?");
    System.out.println("Hány malac van a farmon?");
    int chicNum = input1.nextInt();
    int pigNum = input2.nextInt();
    System.out.println(chicNum*2 + pigNum*4);

  }
}
