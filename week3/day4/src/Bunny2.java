public class Bunny2 {
  public static void main(String[] args) {
    int bunny = 2;
    int ear = 2;
    System.out.println(bunnies(bunny,ear));
  }
  static int bunnies (int ear,int bunny){
      if (bunny == 0){
        return 0;
      } else if (bunny % 2 != 0){
        return  ear + bunnies(ear,bunny-1);
      } else


    return  (ear+1) + bunnies(ear,bunny-1) ;
  }
}

// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).