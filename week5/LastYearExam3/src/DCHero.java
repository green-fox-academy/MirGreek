public class DCHero extends Hero{

  public DCHero(String name){
    super(name,45);

  }

  public DCHero(String name,int motivation){
    super(name,motivation);

  }

  public void punch(Punchable other) {
    damage = motivation / 1.5;
    if (getMotivationLevel() >= 1 && other instanceof MarvelHero ){ //they cannot punch other heroes from the same "Universe":
      other.bePunched(damage);               //hero punches other heroes only if his/her motivation level is at least 1
    } else System.out.println("I am not motivated anymore");
  }
}
