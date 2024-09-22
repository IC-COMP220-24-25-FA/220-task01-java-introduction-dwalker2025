package edu.ithaca.dragon.shapes;

import edu.ithaca.dragon.shapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class TriangleTest {

    @Test
    public void sampleTestThatPasses() {
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8 > 5);
        assertFalse(8 < 5);
    }

    @Test
    public void calcAreaTest() {
        Triangle myTriangle = new Triangle(3, 4, 5);
        assertEquals(6, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(5, 12, 13);
        assertEquals(30, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(7, 24, 25);
        assertEquals(84, myTriangle.calcArea(), 0.0001);
    }

    @Test
    public void doubleSizeTest() {
        Triangle myTriangle = new Triangle(3, 4, 5);
        myTriangle.doubleSize();
        assertEquals(24, myTriangle.calcArea(), 0.0001);  // Expected area after doubling the sides
        assertEquals(10, myTriangle.longestLineWithin(), 0.0001);

        myTriangle = new Triangle(1.5, 2, 2.5);
        myTriangle.doubleSize();
        assertEquals(6.0, myTriangle.calcArea(), 0.0001);  // Expected area after doubling the sides
        assertEquals(5, myTriangle.longestLineWithin(), 0.0001);
    }


    @Test
    public void longestLineWithinTest() {
        Triangle myTriangle = new Triangle(3, 4, 5);
        assertEquals(5, myTriangle.longestLineWithin(), 0.0001);

        myTriangle = new Triangle(7, 24, 25);
        assertEquals(25, myTriangle.longestLineWithin(), 0.0001);

        myTriangle = new Triangle(8, 15, 17);
        assertEquals(17, myTriangle.longestLineWithin(), 0.0001);
    }

    @Test
    public void TestConstructorError() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, -3, 4));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 10));
    }
}

