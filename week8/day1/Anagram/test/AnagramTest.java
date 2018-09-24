import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void TestIfLengthIsEqual(){
        String apple ="apple";
        String banana = "banana";
        Assert.assertEquals(false,Anagram.isAnagram(apple,banana));
        Assert.assertFalse(Anagram.isAnagram(apple,banana));
    }
    @Test
    public void TestIfAnagram(){
        String apple ="apple";
        String banana = "palpe";
        Assert.assertEquals(true,Anagram.isAnagram(apple,banana));
        Assert.assertTrue(Anagram.isAnagram(apple,banana));
    }
    @Test
    public void TestIfAnagramCaseSensitive(){
        String apple ="Apple";
        String banana = "palpe";
        Assert.assertEquals(true,Anagram.isAnagram(apple,banana));
        Assert.assertTrue(Anagram.isAnagram(apple,banana));
    }

    @Test
    public void TestIfAnagramHasSpace(){
        String apple ="Appl e";
        String banana = "p alpe";
        Assert.assertEquals(true,Anagram.isAnagram(apple,banana));
        Assert.assertTrue(Anagram.isAnagram(apple,banana));
    }
}