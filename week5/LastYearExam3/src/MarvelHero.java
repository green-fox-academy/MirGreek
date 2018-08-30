public class MarvelHero extends  Hero {

  public MarvelHero(String name, int motivation) {
    super(name, motivation);
  }
  public MarvelHero(String name){
    super(name,40);

  }

  public void punch(Punchable other) {
    damage = motivation / 1.5;
    if (getMotivationLevel() >= 1 && other instanceof DCHero ){ //they cannot punch other heroes from the same "Universe":
      other.bePunched(damage);               //hero punches other heroes only if his/her motivation level is at least 1
    }
  }
}
