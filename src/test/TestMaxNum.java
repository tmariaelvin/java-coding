package test;


import main.Calculation;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaxNum {
    @Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Calculation.findMax(new int[]{-12, -1, -3, -4, -2}));
    }
}  