import java.util.ArrayList;

public class Carrier {

  String name;
  ArrayList<AirCraft> airCrafts = new ArrayList<>();


  public void addToCarrier(AirCraft aircraft) {
    this.airCrafts.add(aircraft);
  }


  public int fill(){
    int ammoStorage = 2000;
    int minimumAmmo=0;
      int filled = 0;
      int temp=0;

    for (int k = 0; k < airCrafts.size(); k++) {
      minimumAmmo = +airCrafts.get(k).maxAmmo;
    }

    if (ammoStorage <minimumAmmo){

    }else
      for (int i = 0; i < airCrafts.size(); i++) {
        if (airCrafts.get(i).ammoStore <= airCrafts.get(i).maxAmmo) {
          for (int j = 0; j <= airCrafts.get(i).maxAmmo; j++) {
            temp = j;
            airCrafts.get(i).ammoStore=temp;
          }
        }
        filled+=temp;
      }
      ammoStorage-=filled;
    System.out.println(filled);

    return ammoStorage;
  }




Carrier(){
    this.name=name;
}

}
