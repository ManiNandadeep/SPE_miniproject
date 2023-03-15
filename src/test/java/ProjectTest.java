import static org.junit.Assert.*;
import org.junit.Test;

public class ProjectTest {
    SPE_miniproject obj =  new SPE_miniproject();
    @Test
    public void testSqrt() {
        double result = obj.MySQRT(25);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testFactorial() {
        int result = obj.MyFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testLn() {
        double result = obj.MyLog(10.0);
        assertEquals(2.302585, result, 0.0001);
    }

    @Test
    public void testPower() {
        double result = obj.MyPow(2.0, 3.0);
        assertEquals(8.0, result, 0.0001);
    }

}
