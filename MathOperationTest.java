import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationTest {

    @Test
    public void testAddition() {
        assertEquals("+", MathOperation.mathFunction(1, 2, 3));
        assertEquals("+*", MathOperation.mathFunction(2, 2, 4));
        assertEquals("+", MathOperation.mathFunction(0, 5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals("-", MathOperation.mathFunction(1, 2, -1));
        assertEquals("-", MathOperation.mathFunction(5, 3, 2));
        assertEquals("-", MathOperation.mathFunction(0, 0, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals("*", MathOperation.mathFunction(3, -3, -9));
        assertEquals("*", MathOperation.mathFunction(0, 0, 0));
        assertEquals("*", MathOperation.mathFunction(2, 3, 6));
    }

    @Test
    public void testDivision() {
        assertEquals("/", MathOperation.mathFunction(6, 2, 3));
        assertEquals("/", MathOperation.mathFunction(10, 2, 5));
        assertEquals("/", MathOperation.mathFunction(0, 1, 0));
    }

    @Test
    public void testNoOperation() {
        assertEquals("None", MathOperation.mathFunction(7, 1, 11));
        assertEquals("None", MathOperation.mathFunction(3, 3, 1));
        assertEquals("None", MathOperation.mathFunction(1, 2, 5));
    }
}
