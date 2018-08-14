import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Homework {
  public class Tree2 {
    public class Tree1{

      String type;
      int age;
      String sex;
      String leafColor;

    }
    public void main(String[] args) {


      ArrayList<Map<String, Object>> treeMap = new ArrayList<>();

      Map<String, Object> row0 = new HashMap<>();
      row0.put("type:", "oak");
      row0.put("age:", 2);
      row0.put("sex:", "girl");
      row0.put("leafcolor:", "lightgreen");
      treeMap.add(row0);
    }
  }
  public class Tree3{
    public void main(String[] args) {
      ArrayList<ArrayList<String>> tree3List = new ArrayList<>();
      tree3List.add(new ArrayList<String> (Arrays.asList("type, oak")));
      tree3List.add(new ArrayList<String> (Arrays.asList("age, 3")));
      tree3List.add(new ArrayList<String> (Arrays.asList("sex, boy")));
      tree3List.add(new ArrayList<String> (Arrays.asList("leafcolor, darkgreen")));
    }
  }
  public class Tree4{

    String type;
    int age;
    String sex;
    String leafColor;



  }
  public class Tree5{

    String type;
    int age;
    String sex;
    String leafColor;



  }

}
