import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public  class NumberConverterTest {

    @Test
    public void ifIsDouble() {
        String num = "five";
        int number = 5;
        Assert.assertTrue("five",NumberToWord.pw(number,num));
    }



}