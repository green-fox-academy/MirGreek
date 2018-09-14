import java.util.ArrayList;

public class AntiDiagonals {

  public static double getAntiDiagonalAvg(int[][] matrix){
    ArrayList<Integer> matrixElement = new ArrayList<>();
    int matrixLength=matrix.length;
    int tempNum=0;
    int sum=0;
    int[]tempArr = new int[matrixLength];

    for (int i = 0; i <matrix.length ; i++) {
      tempNum=matrix[i][matrixLength-1-i];
      matrixElement.add(tempNum);
      System.out.println(matrixElement);
    }
    for (int i = 0; i <matrixElement.size() ; i++) {
      sum+= matrixElement.get(i);
    }
    System.out.println(sum);
    double result=sum/matrixLength;
    System.out.println(result);

    return result ;
  }
}
