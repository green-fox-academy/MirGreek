import java.util.ArrayList;

public class AntiDiagonals {
  public static void main(String[] args) {
    int[][] matrix =  {{1, 2, 3},{3, 4, 6},{5, 2, 5}};
    int[][] matrix2 =  {{3, 5, 11, -2} ,{3, 1, 7, 4}, {5, 0, 2, 9},{21, 7, 8, 2}};

    //System.out.println(matrix.length);
    getAntiDiagonalAvg(matrix2);

  }
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
//export default getAntiDiagonalAvg;

//need to get the size of matrix
//all numbers new variable