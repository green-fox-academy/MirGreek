public class Sponsor {
  String name= "SmartIam";
  int age = 56;
  String gender = "man";
  String company = "CoolPlaceToWork";
  int hiredStudents = 15;


  public void introduce() {
    System.out.println("Hi, my name is " + name + ", and I'm a " + age + " years old " + gender + ", who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public static void myGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company =company;
    this.hiredStudents = hiredStudents;
  }
    public int hire(int hiredStudents){
    this.hiredStudents = hiredStudents +1;
    return hiredStudents;
  }
}
