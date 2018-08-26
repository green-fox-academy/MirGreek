public class Main {
  public static void main(String[] args) {
   f16 airCraft = new f16();
   f35 plane = new f35();

    //f16 aircraftAnother = new f16(12,50,0);
   // System.out.println(aircraftAnother.baseDamage);

    System.out.println(airCraft.getType());
    System.out.println(plane.getType());


    System.out.println(plane.name);
    System.out.println(plane.refill(100));
    System.out.println(plane.ammoStore);
    System.out.println(plane.fight());

  }
}
