import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class UniqueLettersTest {

  @org.junit.Test
  public void main() {

  }

  @org.junit.Test
  public void uniqueCharacters() {
    String test1 = "hello";
    ArrayList<Character> myTest = UniqueLetters.uniqueCharacters(test1);
    Assert.assertTrue(myTest.contains('e'));
    Assert.assertTrue(myTest.contains('o'));
  }

  public void uniqueCharacters2() {
    String test1 = "hello";
    ArrayList<Character> myTest = UniqueLetters.uniqueCharacters(test1);
    Assert.assertFalse(myTest.contains('e'));

  }
    //@Test
    private void UniqueCharTestFail(){
    //String test2 ="hello";
  //List<String> mytest2=uniqueCharacters(test2);
  //Assert.assertFalse(mytest2.contains("l"));   } }

    //Assert.assertEquals(true,Anagram.anagram(string1,string2));import org.junit.Assert; import org.junit.Test; import java.util.List; public class UniqueChartTest {   @Test   public void UniqueCharTest1() {     String test1 = "hello";     List<String> myTest = UniqueChart.uniqueCharacters(test1);     Assert.assertTrue(myTest.contains("e"));     Assert.assertTrue(myTest.contains("o"));   }   @Test   public void UniqueCharTestFail(){     String test2 ="hello";     List<String>mytest2=UniqueChart.uniqueCharacters(test2);     Assert.assertFalse(mytest2.contains("l"));   } }
  }
}