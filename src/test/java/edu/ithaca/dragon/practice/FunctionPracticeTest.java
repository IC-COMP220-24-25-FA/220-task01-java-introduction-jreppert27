package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(20.13, FunctionPractice.calcSalePrice(19.99, 5, 6));
        assertEquals(1.00, FunctionPractice.calcSalePrice(1.00, 1, 1));
        assertEquals(7.90, FunctionPractice.calcSalePrice(9.66, 25, 9));
    }
    
    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(17, 9, true));
        assertTrue(FunctionPractice.isGoodDog(10, 1, true));
        assertTrue(FunctionPractice.isGoodDog(1, 0, false));

        assertFalse(FunctionPractice.isGoodDog(15, 4, false));
        assertFalse(FunctionPractice.isGoodDog(5, 3, false));

    }

    @Test
    public void findFirstLargestTest(){
        throw new RuntimeException("Not Implemented"); 
    }

    @Test
    public void findLastLargestTest(){
        throw new RuntimeException("Not Implemented");
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        throw new RuntimeException("Not Implemented");
    }
}
