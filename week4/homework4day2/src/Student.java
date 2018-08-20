public class Student {

  String name = "Mirke";
  int age = 27;
  String gender = "GrownUPWoman";
  String previousOrganization = "BB";
  int skippedDays = 0;

//skipDays(numberOfDays): increases skippedDays by numberOfDays
  /*
  Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
   */


  public void introduce() {
    System.out.println("Hi, my name is " + name + ", and I'm a " + age + " years old " + gender + " from " + previousOrganization  + " who skipped " + skippedDays + " days from the course already.");
  }

  public static void myGoal() {
    System.out.println( "Be a junior software developer.");
  }

  public Student(String name, int age, String gender, String previousOrganization,int skippedDays ) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization =previousOrganization;
    this.skippedDays =skippedDays;
  }
  public void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
    System.out.println(this.skippedDays);
  }
}
