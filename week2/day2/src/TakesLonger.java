public class TakesLonger {
    public static void main(String... args){
      String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

      // When saving this quote a disk error has occured. Please fix it.
      // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
      // Using pieces of the quote variable (instead of just redefining the string)
      System.out.println(quote.indexOf("It"));
      System.out.println(quote.indexOf("you"));
      String quote3 = quote.substring(21);
      String quote1 = quote.substring(0,21);
      //String qoute2 = "always takes longer than";

      quote = quote1 + "always takes longer than " + quote3;

    //newString.insert(quote.indexOf("you")
      System.out.println(quote);
    }
  }
