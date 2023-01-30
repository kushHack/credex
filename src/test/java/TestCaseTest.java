import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCaseTest {

    @Test
    void getFactorial() {
        assertEquals(120, TestCase.getFactorial(5,1));
    }
}