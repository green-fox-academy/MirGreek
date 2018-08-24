import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram anagramObj =new Anagram();

  @Test
  public void main() {

  }

  @Test
  public void anagram() {
    String string1 = "bármi";
    String string2 = "bárki";
    Assert.assertEquals(true,Anagram.anagram(string1,string2));
  }
}