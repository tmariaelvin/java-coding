package test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testSum() {
        int result = 2 + 2;
        assertEquals(4, result);
    }
}
