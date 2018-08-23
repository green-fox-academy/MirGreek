import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest2 {

  @Test
  public void getApple() {
    Apple apple = new Apple();
    assertEquals("apple",apple.getApple());
  }
}