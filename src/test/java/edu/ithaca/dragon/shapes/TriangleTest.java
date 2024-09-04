package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(3, 4);
        assertEquals(6, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(7.5, 3.07);
        assertEquals(11.5125, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(1, 1);
        assertEquals(0.5, myTriangle.calcArea(), 0.0001);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3, 4);
        myTriangle.doubleSize(); 
        assertEquals(12, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(7.5, 3.07);
        myTriangle.doubleSize();
        assertEquals(23.025000000000002, myTriangle.calcArea(), 0.0001);

        myTriangle = new Triangle(1, 1);
        myTriangle.doubleSize();
        assertEquals(1.0000000000000002, myTriangle.calcArea(), 0.0001);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(3, 4);
        assertEquals(4.272001872658765, myTriangle.longestLineWithin(), 0.0000000001);

        myTriangle = new Triangle(7.5, 3.07);
        assertEquals(4.846380092398862, myTriangle.longestLineWithin(), 0.0000000001);

        myTriangle = new Triangle(1, 1);
        assertEquals(1.118033988749895, myTriangle.longestLineWithin(), 0.00000000001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 0));
    }
}
