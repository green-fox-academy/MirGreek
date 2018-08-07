public class GreetFunction {
  private static final String AppendA ="" ;

  public static void main(String[] args) {
    //meghívjuk és kiírjuk a function-t
    String typo = "Chinchill";
    appendAfunct(typo);
    System.out.println(appendAFunct(typo));
  }

  private static void appendAfunct(String typo) {
  }
  //itt pedig a function-t létrehozzuk


  public static String appendAFunct(String typo) {
    return typo + "a";
  }
}
//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`