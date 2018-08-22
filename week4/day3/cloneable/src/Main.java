public class Main {
  public static void main(String[] args) {


  Student john = new Student("John",20,"male","BME",1);

  Student johnClone = john.clone();
    johnClone.introduce();
    john.introduce();

  }

}
