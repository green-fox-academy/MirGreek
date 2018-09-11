import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrickyAverageTest {

  @Test
  public void main() {
  }

  @Test
public void getTrickyAvg() {
  TrickyAverage average = new TrickyAverage();
  int[] array = {2, 3, 4, 5, 6, 7, 9, 10, 12};
  Assert.assertNotEquals(false,average.getTrickyAvg(array,4.0));
}


  @Test
  public void getTrickyAvgAnother() {
    TrickyAverage average = new TrickyAverage();
    int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 10};
    Assert.assertNotEquals(true,average.getTrickyAvg(array,0.1));
  }
}