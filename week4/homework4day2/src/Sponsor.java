public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender) {
    super(name, age, gender);
  }


  public void introduce() {
    System.out.println("Hi, my name is " + name + ", and I'm a " + age + " years old " + gender + ", who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public static void myGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
    this.company = company;
    this.hiredStudents = hiredStudents;
  }

  public int hire() {
    this.hiredStudents = hiredStudents + 1;
    return hiredStudents;
  }

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
