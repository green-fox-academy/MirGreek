public class EvenNumbers {
  public static void main(String[] args) {
    // Create a program that prints all the even numbers between 0 and 500
    for (int i = 0; i <500 ; i++) {
      int evenNumber = (i % 2);
      if (evenNumber==0) {
        System.out.println(i);

      }

    }
  }
}
