public abstract class BaseHero   {

  private String name;




  public abstract void punch(Punchable other);

  public abstract int getMotivationLevel();

  public String getName() {
    return name;
  }

}