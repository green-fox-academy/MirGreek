public class Student extends Person {

  private String classroom;
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

     public Student (String name, int age, String gender,String previousOrganization, int skippedDays){
       this.previousOrganization = previousOrganization;
       this.skippedDays = skippedDays;
    }
      public int skipDays (int numberOfDays){
      this.skippedDays += numberOfDays;
      return this.skippedDays;
    }
  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "School of life";
    this.skippedDays = 0;
  }
    }
