

public class Main {
  public static void main(String[] args) {

    AircraftCarrier szomalia = new AircraftCarrier(2000, 10);
    szomalia.add(new F35());
    szomalia.add(new F35());
    szomalia.refill();
//    System.out.println(szomalia.ammoOfCarrier);

    AircraftCarrier bangladesh = new AircraftCarrier(1500, 5000);
    bangladesh.add(new F35());
    bangladesh.add(new F35());
    bangladesh.refill();

    bangladesh.carrierFight(szomalia);
    szomalia.getStatus();
    System.out.println();
    bangladesh.getStatus();
  }
}