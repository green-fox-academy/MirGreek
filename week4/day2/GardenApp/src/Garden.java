import java.util.ArrayList;
import java.util.List;

public class Garden{
  List<PlantSuper> garden;

  double water;

public Garden(){
   this.garden = new ArrayList<>();
   this.water=0.0;
}
void plantAdd (PlantSuper plant){
  garden.add(plant);
}



}

