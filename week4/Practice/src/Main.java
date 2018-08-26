public class Main {
  public static void main(String[] args) {
   f16 airCraft = new f16();
   f35 plane = new f35();
   f16 planeMir = new f16();


    //System.out.println(airCraft.getType());
    //System.out.println(plane.getType());


    //System.out.println(plane.name);
    //System.out.println(plane.refill(100));
    //System.out.println(plane.ammoStore);
    //System.out.println(plane.fight());
    //System.out.println(plane.getStatus());
    //System.out.println(plane.isPriority());

    Carrier carrier1 = new Carrier();
    carrier1.addToCarrier(airCraft);
    carrier1.addToCarrier(plane);
    carrier1.addToCarrier(planeMir);
    carrier1.fill();


  }
}
