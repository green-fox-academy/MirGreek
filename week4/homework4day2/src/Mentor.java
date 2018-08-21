public class Mentor extends Person {

  String level = "Senior";

  public Mentor(String name, int age, String gender) {
    super(name, age, gender);
  }


  public void introduce() {
    System.out.println("Hi, my name is " + name + ", and I'm a " + age + " years old " + gender + " " +  level + " mentor.");
  }

  public static void myGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }
  public Mentor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
  }

}
