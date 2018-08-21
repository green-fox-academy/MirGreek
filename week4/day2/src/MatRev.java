import java.util.ArrayList;

public class MatRev {
  public static void main(String[] args) {
    Dogs doggie = new Dogs("Nessie");
    Dogs fluffy = new Dogs("Lucky");

    //doggie.setName("Nessie");
    //fluffy.setName("Lucky");
    new GoldenRetriever("Fluffs");
    new Dogs("Bodza");
    Dogs gr = new GoldenRetriever("aha");
    //GoldenRetriever(gr).woof();

    ArrayList<Object> objects = new ArrayList<>();
    objects.add("cat");
    objects.add(5);
    objects.add(fluffy);
    for (Object o : objects){
      if (o instanceof Integer){
        System.out.println(10*(Integer)o);

      }else  if (o instanceof  GoldenRetriever){
        ((GoldenRetriever)o).woof();

      }else System.out.println(((Dogs)o).getName());
    }
  }
}
