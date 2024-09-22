import edu.ithaca.dragon.shapes.Circle;
import edu.ithaca.dragon.shapes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(3,4);

        assertEquals(12, myRectangle.calcArea());

        myRectangle = new Rectangle(5, 10);

        assertEquals(50, myRectangle.calcArea());

        myRectangle = new Rectangle(7, 8);

        assertEquals(56, myRectangle.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(1,3);
        myRectangle.doubleSize();
        assertEquals(2, myRectangle.length);
        assertEquals(6, myRectangle.width);

        myRectangle = new Rectangle(23,34);
        myRectangle.doubleSize();
        assertEquals(46, myRectangle.length);
        assertEquals(68, myRectangle.width);

        myRectangle = new Rectangle(1.5,0.1);
        myRectangle.doubleSize();
        assertEquals(3, myRectangle.length);
        assertEquals(0.2, myRectangle.width);


    }

    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(3,4);
        assertEquals(5, myRectangle.longestLineWithin(),0.1);

        myRectangle = new Rectangle(10,25);
        assertEquals(26.92, myRectangle.longestLineWithin(), 0.1);

        myRectangle = new Rectangle(0.5,0.8);
        assertEquals(0.9434, myRectangle.longestLineWithin(),0.0001);



    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,-3));
    }



}

