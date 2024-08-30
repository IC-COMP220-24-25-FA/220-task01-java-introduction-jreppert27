package edu.ithaca.dragon.shapes;

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
        Rectangle myRectangle = new Rectangle(3, 4);
        assertEquals(12, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(7.5, 3.07);
        assertEquals(23.025, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(1, 1);
        assertEquals(1, myRectangle.calcArea(), 0.0001);
    }

    @Test
    public void doubleSizeTest(){
        
    }

    @Test
    public void longestLineWithinTest(){

    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 0));
    }


    
}