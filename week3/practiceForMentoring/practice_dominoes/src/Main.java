import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

  static int diagonalDifference(int[][] arr) {
    int difference = 0;
    int rightDiagonal = 0;
    int leftDiagonal = 0;
    int matrixLength = 0;

    for (int i = 0; i <arr.length ; i++) {
      if (arr[i].length == arr.length) {
        matrixLength = arr.length;
      }
    }

    for (int i = 0; i < matrixLength ; i++) {
      leftDiagonal += arr[i][i];
    }
    int intI =0;
    for (int j = 0; j < matrixLength; j++) {
      rightDiagonal+= arr[j][(matrixLength-1)-j];
    }

    difference = (leftDiagonal - rightDiagonal);

    return Math.abs(difference);
  }
  // Complete the diagonalDifference function below.



  public static void main(String[] args) throws IOException {


    int[][] arr = {{11, 2, 4},
                    {4, 5, 6},
                    {10, 8, -12}};

      int result = diagonalDifference(arr);
    System.out.println(result);

    }
  }


