import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NitChipMirTest {

    @Test
    public void testIfItIsMinusOne(){
        List<Integer> listToCheck = null;
        Assert.assertEquals(-2,NitChipMir.getIndex(listToCheck,0));
    }

    @Test
    public void testIfEmptyList(){
        List<Integer> listToCheck = Arrays.asList(0,2,4,6,8);
        Assert.assertEquals(1,NitChipMir.getIndex(listToCheck,2));
    }
    @Test
    public void testIfThelistHasTheNumber(){
        List<Integer> listToCheck = Arrays.asList(0,2,4,6,8);
        Assert.assertEquals(-1,NitChipMir.getIndex(listToCheck,7));
    }
}