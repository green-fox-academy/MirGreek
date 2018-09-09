import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> carrier;
    int carrierAmmo;
    int HP;
    int sumOfDamages=0;


    public Carrier(int carrierAmmo, int HP){
        carrier = new ArrayList<>();
        this.HP=HP;
        this.carrierAmmo=carrierAmmo;
    }

    public void add(Aircraft aircraft){
        carrier.add(aircraft);
    }



    public void fill(){
        int numberForEachAirCraft = carrierAmmo/carrier.size();
        if (carrierAmmo == 0) System.out.println("There is no ammo in the ammo store!");
      if(numberForEachAirCraft < minimumAmmo()) {
          for (int i = 0; i <carrier.size() ; i++) {
               if(carrier.get(i).isPriority()){
                   carrier.get(i).refill(numberForEachAirCraft);
               }
          }
      } else for (int i = 0; i <carrier.size() ; i++) {
                carrier.get(i).refill(numberForEachAirCraft);
                carrierAmmo-=numberForEachAirCraft;
        }

    }
    public int minimumAmmo(){
        int sumOfMaxammo = 0;
        for (int i = 0; i <carrier.size() ; i++) {
               sumOfMaxammo+= carrier.get(i).maxAmmo;
        }
        return sumOfMaxammo;
    }

    public void fight(Carrier otherCarrier){
        int sumOfAmmos=0;
        for (int i = 0; i <carrier.size() ; i++) {
           sumOfAmmos+= carrier.get(i).ammo;
        }
        otherCarrier.HP-=allDamageDealt();

        }


    public int allDamageDealt() {

        for (int i = 0; i < carrier.size(); i++) {
            sumOfDamages += carrier.get(i).damage;
        }
        return sumOfDamages;
    }





    public String getStatus(){
        System.out.println("HP: "+ HP + ", "+ " Aircraft count: " + carrier.size() + ", Ammo storage: " + carrierAmmo + ", Total damage: " + sumOfDamages);
        return "HP: "+ HP + ", "+ " Aircraft count: " + carrier.size() + ", Ammo storage: " + carrierAmmo + ", Total damage: " + sumOfDamages ;   //HP: 5000, Aircraft count: 4, Ammo Storage: 2300, Total damage: 2280
    }

}
/*

fight()


It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
 */