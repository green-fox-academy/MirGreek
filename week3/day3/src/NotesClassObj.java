import sun.applet.resources.MsgAppletViewer;

import java.util.HashMap;
import java.util.Map;

public class NotesClassObj {
  public static void main(String[] args) {
    Map<String,Integer> dog = new HashMap<>();//Not Object Oriented
    dog.put("belly",0);
   feed(dog);
    System.out.println(dog);
    //Object Oriented
    Dog morzsi = new Dog(); //default constructor runs with new
    morzsi.eat();
    morzsi.barkHowAreYou();
    morzsi.moodLevel= 4;
    System.out.println(morzsi.name);
    Car trabant = new Car(1,2);
    System.out.println(trabant.getLicencePlate());
    Car celica = new Car (0,1);

    CarWithLicenceplate tarbi2 =new CarWithLicenceplate(1,2);
    CarWithLicenceplate tarbi3 =new CarWithLicenceplate(1,2);
    //System.out.println(trabi2.getLiceseplate);
  }

public static void feed(Map<String, Integer> dog){
    dog.put("belly", dog.get("belly") + 1);
}
}
