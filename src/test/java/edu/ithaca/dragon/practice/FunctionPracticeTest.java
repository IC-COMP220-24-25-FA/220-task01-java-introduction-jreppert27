package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.List;
import java.util.ArrayList;

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
        List<Integer> newList = List.of(1, 2, 3, 4, 5);
        assertEquals(4, FunctionPractice.findFirstLargest(newList));
        newList = List.of(5, 4, 3, 2, -1);
        assertEquals(0, FunctionPractice.findFirstLargest(newList));
        newList = List.of(1, 2, 2, 2, 1);
        assertEquals(1, FunctionPractice.findFirstLargest(newList));
        newList = List.of(5, 0, 3, 4, 5);
        assertEquals(0, FunctionPractice.findFirstLargest(newList));
        newList = List.of();
        assertEquals(-1, FunctionPractice.findFirstLargest(newList));
    }

    @Test
    public void findLastLargestTest(){
        List<Integer> newList = List.of(1, 2, 3, 4, 5);
        assertEquals(4, FunctionPractice.findLastLargest(newList));
        newList = List.of(5, 4, 3, 2, -1);
        assertEquals(0, FunctionPractice.findLastLargest(newList));
        newList = List.of(1, 2, 2, 2, 1);
        assertEquals(3, FunctionPractice.findLastLargest(newList));
        newList = List.of(5, 0, 3, 4, 5);
        assertEquals(4, FunctionPractice.findLastLargest(newList));
        newList = List.of();
        assertEquals(-1, FunctionPractice.findLastLargest(newList));
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest(){
        List<String> newList = List.of("dog", "bat", "cat", "dandalion");    
        assertEquals("dandalion", FunctionPractice.findFirstMostOccurencesOfLetter(newList, 'a'));
        newList = List.of("dog", "bat", "cat", "dandalion");    
        assertEquals("dog", FunctionPractice.findFirstMostOccurencesOfLetter(newList, 'g'));
        newList = List.of("dog", "bat", "cat", "dandalion");    
        assertEquals(null, FunctionPractice.findFirstMostOccurencesOfLetter(newList, 'z'));
        newList = List.of();    
        assertEquals(null, FunctionPractice.findFirstMostOccurencesOfLetter(newList, 'a'));
    }
}
