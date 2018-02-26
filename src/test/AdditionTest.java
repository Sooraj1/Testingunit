import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AdditionTest {
    private Addition addition=new Addition();
    @Test
    public void canaryTest(){
        Assert.assertTrue(true);
    }
    @Test
    public void tesTheMainMethod(){
     String[] str={"12","13"};
    // Assert.assertTrue(Addition.main(str));
    }
    @Test
    public void testTheSumWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals("Adding of two integers",addition.add(10,20),30);


    }
    @Test
    public void testTheaddwithtwoString(){
        Assert.assertEquals("Addition with two Strings",addition.add("abc","xyz"),"abcxyz");
    }
    @Test
    public void testAddwithtwoList(){
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);
        List<Integer> l2=new ArrayList<>();
        l2.add(3);
        l2.add(5);
        l2.add(6);
        List<Integer> l3=new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);
        //Assert.assertArrayEquals(addition.add(l1,l2),l3);
        Assert.assertEquals("Addition with two list",addition.add(l1,l2),l3);
    }
    @Test
    public void testwithtwodouble(){
        Assert.assertEquals("Adding with double",addition.add(10.02334,9.98),20.2035,0.2223);
    }
}
