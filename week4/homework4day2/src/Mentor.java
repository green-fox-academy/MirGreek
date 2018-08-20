public class Mentor {
  String name = "Kamo";
  int age = 35;
  String gender = "man";
  String previousOrganization = "GF";
  int skippedDays = 3;
  String level = "Senior";



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
}
