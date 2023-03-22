import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.Math;


public class ProjectTest {
    SPE_miniproject obj =  new SPE_miniproject();
    @Test
    public void testSqrt() {
        assertEquals(3.0, obj.MySQRT(9),0.0001);
        assertEquals(5.0, obj.MySQRT(25), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, obj.MyFactorial(0));
        assertEquals(1, obj.MyFactorial(1));
        assertEquals(24, obj.MyFactorial(4));
        assertEquals(120, obj.MyFactorial(5));
    }

    @Test
    public void testLn() {
        assertEquals(1.0, obj.MyLog(Math.E),0.0001);
        assertEquals(2.302585, obj.MyLog(10.0), 0.0001);
    }

    @Test
    public void testPower() {
        assertEquals(4.0, obj.MyPow(2.0, 2.0), 0.0001);
        assertNotEquals(4.0, obj.MyPow(2.0,1.0), 0.0001);
        assertEquals(8.0, obj.MyPow(2.0, 3.0), 0.0001);

    }

}
