public class Dog {
  private int belly = 0;
  String name = "Good Girl";
  public int moodLevel;
  public void eat() {
    belly++;
  }
    public void barkHowAreYou(){
      System.out.println("My belly is " + belly);
    }
}

//constructor called once