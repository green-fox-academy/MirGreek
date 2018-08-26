public class AirCraft {
  int maxAmmo;
  int baseDamage;
  int ammoStore;
  String name;


  public void ammoTrack(){
   System.out.println(ammoStore);
 }

 public String fight(){
   int Damage = 0;
    ammoStore = 0;
    Damage = baseDamage * maxAmmo;
    return "The demage of this aircraft is : " +  Damage;
 }
  public String refill(int fillWith){
    int filled = 0;
    if (ammoStore <= maxAmmo ){
      for (int i = 0; i <= maxAmmo ; i++) {
        filled=i;
      }
    }else System.out.println("The ammostore is fully charged!");
      ammoStore=filled;
    return "The ammo was filled with: " + fillWith + ", " + "the aircraft was filled up to: " + filled + ", " + " and the remainig is: " + (fillWith-filled);
  }

  public String getType() {
    return this.getClass().getName();
    // this instanceof f16
  }

  public String getStatus(){
    return "Type: " + getType() + ", Ammo: " + ammoStore + ", Base damage: " + baseDamage + ", " + fight();
  }

 public AirCraft(int maxAmmo, int baseDamage,int ammoStore){
   super();
   this.baseDamage=baseDamage;
    this.maxAmmo=maxAmmo;
    this.ammoStore= ammoStore;
}
public boolean isPriority(){
    if(this.equals("F35")) {
    return true;
  } else return false;
}


}
