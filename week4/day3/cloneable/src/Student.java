public class Student extends Person implements Cloneable {


  String previousOrganization;
  int skippedDays;

  //public Student(String name, int age, String gender) {
  //super(name, age, gender);
  //}

  public void introduce () {
    System.out.println("Hi, my name is " + name + ", and I'm a " + age + " years old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public static void myGoal () {
    System.out.println("Be a junior software developer.");
  }

  public Student (String name, int age, String gender, String previousOrganization, int skippedDays){
    super(name, age, gender); //superből hívja a paramétereket
    this.previousOrganization = previousOrganization;
    this.skippedDays = skippedDays;
  }
  public int skipDays (int numberOfDays){
    this.skippedDays += numberOfDays;
    return this.skippedDays;
  }
  public Student() {
    super();
    this.previousOrganization = "School of life";
    this.skippedDays = 0;
  }
  public Student clone(){
    Student name = new Student(this.name,this.age,this.gender,this.previousOrganization,this.skippedDays);
    return name;
  }
}