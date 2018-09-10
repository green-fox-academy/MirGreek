import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

     numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println); //exercise1

    System.out.println(numbers.stream()  //exercise2
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average());


    numbers.stream()
        .filter(n -> n > 0)
        .mapToDouble(n -> Math.pow(n,2))
        .forEach(System.out::println);

    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers2.stream()
        .mapToDouble(n -> Math.pow(n,2))
        .filter(n -> n > 20)
        .forEach(System.out::println);




  }

}
