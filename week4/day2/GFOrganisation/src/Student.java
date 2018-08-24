public class Student extends Person {
  public Student(String name, int age, String gender) {
    super(name, age, gender);

    String previousOrganization = "BB";
    int skippedDays = 0;

  }



  public void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
    System.out.println(this.skippedDays);
  }
}
