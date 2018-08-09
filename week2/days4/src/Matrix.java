public class Matrix {
  public static void main(String[] args) {
    int zero = 0;
    int one = 1;
    int extraIterator = 0;

    for (int i = 0; i < 4; i++) {
      for (int k = 0; k < 4; k++) {
        if (k == i){
          System.out.print(one + " ");
        } else
        System.out.print(zero + " ");

      }
         System.out.println();

      }
      }

    }






/*     for (int k = 0; k <5 ; k++) {
          if (k == 0) {
            System.out.print(one);
          }else
            System.out.print(zero);*/

// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output