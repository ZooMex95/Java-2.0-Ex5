import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void addTest() {
        Assert.assertEquals(Operations.add(1,1), 2, 0);
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals(0.387819, Operations.multiplication(1.051,0.369), 0.000001);
    }

    @Test
    public void subTest() {
        Assert.assertEquals(-0.05, Operations.sub(9.95, 10), 0.1);
    }

    @Test(expected = ArithmeticException.class)
    public void divideTest() {
        Operations.divide(1,0);
    }

}
