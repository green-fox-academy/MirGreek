public class ExerciseOfDrawing {
  public static void main(String[] args) {
    for (int i = 0; i <5 ; i++) {
      for (int j = 0; j <5 ; j++) {
        if (j ==0 || j == 4) {
          System.out.println("*");
          }else if (i ==0 || i == 4) {
            System.out.print("*");
          }
        }
      }


    }
  }
class myFirstArrayInJava {
  public static void main(String[] args) {

    int[] array = {1, 2, 3};
    System.out.println(printArray(array));
  }


  public static String printArray(int[] array) {
    String result = "[";
    for (int i = 0; i < array.length; i++) {
      result += array[i];
      if (i != array.length - 1) {
        result += ", ";
      }
    }
    result = result + "]";
    return result;
  }
}
//for (int current : array){ //foreach element
  //sort orders the elements


