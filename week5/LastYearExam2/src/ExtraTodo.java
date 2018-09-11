public class ExtraTodo {
}
//// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases System.out.println(uniqueCharacters("anagram"));
// Should print out:
// ["n", "g", "r", "m"]


//second
/*public class FavouriteAnimals {
  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    //```java FavouriteAnimals [animal] [animal]```
    // // You can add as many command line arguments as many favourite you have.
    // // One animal should be stored only at once
    // // Each animal should be written in separate lines
    // // The program should only save animals, no need to print them
    */

/* Third
public class TakeMeToThe {
public static void main(String[] args) {
 // We run a Candy shop where we sell candies and lollipops
 // One lollipop's price is 10$
 // And it made from 5gr of sugar
 // One candie's price is 20$
 // And it made from 10gr of sugar
 // we can raise their prices with a given percentage

 // Create a CandyShop class
 // It can store sugar and money as income. The constructor should take the amount of sugar in gramms.
 // we can create lollipops and candies store them in the CandyShop's storage
 // If we create a candie or lollipop the CandyShop's sugar amount gets reduced by the amount needed to create the sweets
 // We can raise the prices of all candies and lollipops with a given percentage
 // We can sell candie or lollipop with a given number as amount
 // If we sell sweets the income will be increased by the price of the sweets and we delete it from the inventory
 // We can buy sugar with a given number as amount. The price of 1000gr sugar is 100$
 // If we buy sugar we can raise the CandyShop's amount of sugar and reduce the income by the price of it.
 // The CandyShop should be represented as string in this format:
 // "Inventory: 3 candies, 2 lollipops, Income: 100, Sugar: 400gr"
 candyShop = new CandyShop(300);
 candyShop.createSweets(CandyShop.CANDY);
 candyShop.createSweets(CandyShop.CANDY);
 candyShop.createSweets(CandyShop.LOLLIPOP);
 candyShop.createSweets(CandyShop.LOLLIPOP);
 System.out.println(candyShop);
 // Should print out:
 // Invetory: 2 candies, 2 lollipops, Income: 0$, Sugar: 270gr
 candyShop.sell(CandyShop.CANDY, 1);
 System.out.println(candyShop);
 // Should print out:
 // "Invetory: 1 candies, 2 lollipops, Income: 20$, Sugar: 285gr"
 candyShop.raise(5);
 candyShop.sell(CandyShop.LOLLIPOP, 1);
 System.out.println(candyShop);
 // Should print out:
 // "Invetory: 1 candies, 1 lollipops, Income: 35$, Sugar: 285gr"
 candyShop.buySugar(300);
 System.out.println(candyShop);
 // Should print out:
 // "Invetory: 1 candies, 1 lollipops, Income: 5$, Sugar: 315gr"
}
}
Message Input
 */