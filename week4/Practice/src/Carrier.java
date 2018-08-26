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
      int filledPriority=0;
      int temp=0;

    for (int k = 0; k < airCrafts.size(); k++) {
      minimumAmmo +=airCrafts.get(k).maxAmmo;
    }

    if (ammoStorage < minimumAmmo){
      for (int x = 0; x <= airCrafts.size() ; x++) {
        if (airCrafts.get(x).ammoStore < airCrafts.get(x).maxAmmo)
          if (airCrafts.get(x).isPriority())
            filledPriority+=x;
        airCrafts.get(x).ammoStore=filledPriority;
      }

    }else
      for (int i = 0; i <= airCrafts.size(); i++) {
        if (airCrafts.get(i).ammoStore < airCrafts.get(i).maxAmmo) {
          for (int j = 0; j < airCrafts.get(i).maxAmmo; j++) {
            temp = i;
            airCrafts.get(i).ammoStore+=temp;
          }

          System.out.println(airCrafts.get(i).maxAmmo + " " +airCrafts.get(i).ammoStore);
        }
        //filled+=temp;
      }
      ammoStorage-=(temp+filledPriority);
    System.out.println(ammoStorage);
    System.out.println(temp);
    return ammoStorage;
  }




Carrier(){
    this.name=name;
}

}
