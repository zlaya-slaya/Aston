import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, App.calculateFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, App.calculateFactorial(1));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(6, App.calculateFactorial(3));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.calculateFactorial(-5);
        });
    }
}