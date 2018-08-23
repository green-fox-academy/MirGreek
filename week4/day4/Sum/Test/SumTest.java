
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumTest {


@Test
  public void sumWorksOrNot(){
  Sum sumList = new Sum();
  sumList.elements(1);
  sumList.elements(2);
  Assert.assertEquals(3,sumList.sumMethod());
}




}