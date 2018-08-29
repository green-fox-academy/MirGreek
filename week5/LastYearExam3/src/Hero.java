public class Hero extends BaseHero implements Punchable  {
  String name;
  double motivation;
  double damage;





  public Hero(String name,int motivation) {
    this.name=name;
    this.motivation=motivation;
  }


  public void punch(Punchable other) {
   damage = motivation / 1.5;
   if (getMotivationLevel() >= 1 ){
        other.bePunched(damage);                              //hero punches other heroes only if his/her motivation level is at least 1
   }
  }

  @Override
  public int getMotivationLevel() {
    if (motivation<25){
      return 0;
    } else if (motivation <= 40 && motivation > 25){
      return 1;
    } else return 2;

  }

  @Override
  public void bePunched(double damage) {
    motivation = motivation - (damage / motivation);
  }
}
