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

    Student student = new Student();
    Teacher teacher = new Teacher();

    student.question(teacher);
    student.learn();

    Car car = new Car();
    Station station = new Station();
    station.refill(car);
    station.refill(car);
    System.out.println(car.getGasAmount());

  }
}
