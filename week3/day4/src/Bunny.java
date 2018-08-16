public class Bunny {
  public static void main(String[] args) {
   int b= 30;
   int ear = 2;
    System.out.println(bunnies(b,ear));
  }
  static int bunnies(int b, int ear) {

    if (b == 1){
      return ear;
  } else

    return (bunnies(ear,b-1)+ear) ;
  }
}


// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).