public class MainCounter {
  public static void main(String[] args) {
    Counter counter = new Counter();
    System.out.println(counter.getValue());
    counter.add();
    System.out.println(counter.value);
    counter.add(5);
    System.out.println(counter.value);
    counter.reset();
    System.out.println(counter.value);
  }
}
