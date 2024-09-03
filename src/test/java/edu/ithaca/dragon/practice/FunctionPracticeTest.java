package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest() {
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest() {
        assertEquals(8.64, FunctionPractice.calcSalePrice(10, 20, 8));
        assertEquals(11, FunctionPractice.calcSalePrice(25, 60, 10));
        assertEquals(56.392, FunctionPractice.calcSalePrice(56, 5, 6));
    }

    @Test
    public void testIsGoodDog() {
        assertTrue(FunctionPractice.isGoodDog(6, 15, true));
        assertFalse(FunctionPractice.isGoodDog(1, 10, true));
        assertFalse(FunctionPractice.isGoodDog(4, 3, true));
        assertFalse(FunctionPractice.isGoodDog(4, 8, false));
    }

    @Test
    public void testFindFirstLargest() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 5);
        assertEquals(2, FunctionPractice.findFirstLargest(numbers));
        numbers = Arrays.asList(1, 3, 2);
        assertEquals(1, FunctionPractice.findFirstLargest(numbers));

        numbers = Arrays.asList();
        assertEquals(-1, FunctionPractice.findFirstLargest(numbers));

        numbers = Arrays.asList(1, 1, 1);
        assertEquals(0, FunctionPractice.findFirstLargest(numbers));
    }

    @Test
    public void testFindLastLargest() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 5);
        assertEquals(4, FunctionPractice.findLastLargest(numbers));
        numbers = Arrays.asList(1, 3, 2);
        assertEquals(1, FunctionPractice.findLastLargest(numbers));

        numbers = Arrays.asList();
        assertEquals(-1, FunctionPractice.findLastLargest(numbers));

        numbers = Arrays.asList(1, 1, 1);
        assertEquals(2, FunctionPractice.findLastLargest(numbers));
    }

}
    

