import Aston.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, App.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, App.calculateFactorial(1));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(6, App.calculateFactorial(3));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            App.calculateFactorial(-5);
        });
    }
}