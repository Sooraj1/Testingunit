import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.example.Subtraction;
import java.util.ArrayList;
import java.util.List;

public class SubtractionTest {

    Subtraction subtraction=new Subtraction();
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void canaryTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void testTheSubtractionWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals("Subtraction of two integers",subtraction.sub(20,10),10);




    }
   @Test
    public void exceptionthrow(){
        subtraction.sub(5,10);
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("First number must be greater than second");
    }
    @Test
    public void testTheaddwithtwoString(){
        Assert.assertEquals("Addition with two Strings",subtraction.sub("soorajawasthi","awasthi"),"sooraj");
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
        l1.removeAll(l2);
        //Assert.assertArrayEquals(addition.add(l1,l2),l3);
        Assert.assertEquals("Addition with two list",subtraction.sub(l1,l2),l1);
    }
    @Test
    public void testwithtwodouble(){
        Assert.assertEquals("Adding with double",subtraction.sub(10.02334,9.98),0.0433,0.2223);
    }
}
