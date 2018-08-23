
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumTest {


@Test
  public void sumWorksOrNot(){
  Sum sumList = new Sum();
  sumList.elements(1);
  Assert.assertEquals(1,sumList.sumMethod());
}




}