public class AirCraft {
  int maxAmmo;
  int baseDamage;
  int ammoStore;
  String type;


  public void ammoTrack(){
   System.out.println(ammoStore);
 }

 public String fight(){
   int Damage = 0;
    ammoStore = 0;
    Damage = baseDamage * maxAmmo;
    return "The demage this aircraft dealt is: " +  + Damage;
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



 public AirCraft(int maxAmmo, int baseDamage,int ammoStore){
    this.baseDamage=baseDamage;
    this.maxAmmo=maxAmmo;
    this.ammoStore= ammoStore;
}
}
