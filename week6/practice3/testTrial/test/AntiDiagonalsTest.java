import org.junit.Test;

import static org.junit.Assert.*;

public class AntiDiagonalsTest {

  @Test
  public void testIfAvgIsGood(){
    int[][] matrix =  {{1, 2, 3},{3, 4, 6},{5, 2, 5}};

    assertEquals(4.0,AntiDiagonals.getAntiDiagonalAvg(matrix),0.0);
  }
  @Test
  public void testIfAvgIsNotGood(){
    int[][] matrix =  {{1, 2, 3},{3, 4, 6},{5, 2, 5}};

    assertNotEquals(6.0,AntiDiagonals.getAntiDiagonalAvg(matrix),0.0);
  }
  @Test
  public void testIfMatrixHasNegativeNumber(){
    int[][] matrix =  {{1, -2, 3},{3, 4, -6},{-5, 2, 5}};

    assertNotEquals(-6.0,AntiDiagonals.getAntiDiagonalAvg(matrix),0.0);
  }


}