public class Student {


  public void learn() {
    System.out.println("I learn this.");

  }

  public void question(Teacher teacher) {
    System.out.println("Why?");
      teacher.answer();
  }
}
