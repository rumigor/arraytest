import testarray.ArrayClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassArray14Test {
    ArrayClass arrayClass;
    private int [] a;

    public MassArray14Test(int[] a) {
        this.a = a;
    }

    @Before
    public void beforeMethod() {
        arrayClass = new ArrayClass();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4, 1}},
                {new int[]{1, 4, 3, 1}},
                {new int[]{1, 1, 1, 1}},
                {new int[]{4, 4, 4, 4}},
                {new int[]{1,4,1,1,1,4}},
                {new int[]{4, 4, 4, 4, 1}}
        });
    }

    @Test
    public void testArray14(){
        Assert.assertTrue(arrayClass.isArrayRight(a));
    }

}
