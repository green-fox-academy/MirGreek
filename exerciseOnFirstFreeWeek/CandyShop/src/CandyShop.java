import java.util.ArrayList;

public class CandyShop {
  public static Sweets CANDY;
  public static Sweets LOLLIPOP;
  ArrayList<Sweets> sugarryStuffs;
  int sugar;
  int money;
  int price;


  public CandyShop(int sugar){
    this.sugar = sugar;
    sugarryStuffs=new ArrayList<>();
    this.price = price;
    System.out.println("Inventory: "+ sugarryStuffs.size()  + ", Income: 100, Sugar: "+ buySugar(0));
    CANDY = new CANDY();

  }

  //CANDY candy = new CANDY();
  //LOLLIPOP lollipop = new LOLLIPOP();

public void getType(){

}

  public String createSweets(Sweets sweet){
    sugarryStuffs.add(sweet);
    System.out.println(sugarryStuffs);
    return sugarryStuffs.size() + ", " + sweet.type;
  }
  // Invetory: 2 candies, 2 lollipops, Income: 0$, Sugar: 270gr





  public void sell(Object candy, int db) {


  }

  public void raise(int db) {

  }

  public int buySugar(int gr) {
     return sugar +=sugar*gr;
  }

}


// Create a CandyShop class
// It can store sugar and money as income. The constructor should take the amount of sugar in gramms.
// we can create lollipops and candies store them in the CandyShop’s storage
// If we create a candie or lollipop, the CandyShop’s sugar amount gets reduced by the amount needed to create the sweets
// We can raise the prices of all candies and lollipops with a given percentage
// We can sell candie or lollipop with a given number as amount
// If we sell sweets the income will be increased by the price of the sweets and we delete it from the inventory
// We can buy sugar with a given number as amount. The price of 1000gr sugar is 100$
// If we buy sugar we can raise the CandyShop’s amount of sugar and reduce the income by the price of it.
// The CandyShop should be represented as string in this format:
// “Inventory: 3 candies, 2 lollipops, Income: 100, Sugar: 400gr”