import testarray.ArrayClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
    private ArrayClass arrayClass;
    @Before
    public void beforeMethod(){
        arrayClass = new ArrayClass();
    }

    @Test
    public void testArrayClass1(){
        Assert.assertArrayEquals(new int[]{2, 5, 1},arrayClass.returnArrayAfter4(new int[]{1,3,6,4,2,5,1}));
    }

    @Test
    public void testArrayClass2(){
        Assert.assertArrayEquals(new int[]{2, 5, 1},arrayClass.returnArrayAfter4(new int[]{1,4,6,4,2,5,1}));
    }
    @Test
    public void testArrayClass3(){
        Assert.assertArrayEquals(new int[]{},arrayClass.returnArrayAfter4(new int[]{1,3,6,4}));

    }
    @Test
    public void testArrayClass4(){
        Assert.assertArrayEquals(new int[]{1,3,6,0},arrayClass.returnArrayAfter4(new int[]{4,1,3,6,0}));
    }
    @Test(expected = RuntimeException.class)
    public void testArrayClass5(){
        arrayClass.returnArrayAfter4(new int[]{1,3,6,2,0,1});
    }
    @Test
    public void testArrayClass6(){
        Assert.assertArrayEquals(new int[]{1,3,6,0},arrayClass.returnArrayAfter4(new int[]{4,1,3,6,0,4}));
    }


}
