package test;



import main.Calculation;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxNum {
    Calculation calculation;

    @BeforeEach
    void setUp() {
        calculation = new Calculation();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testFindMax() {
        assertEquals(4, calculation.findMax(new int[]{1, 3, 4, 2}), "Regular multiplication should work");
        assertEquals(-1, Calculation.findMax(new int[]{-12, -1, -3, -4, -2}));
    }
}  