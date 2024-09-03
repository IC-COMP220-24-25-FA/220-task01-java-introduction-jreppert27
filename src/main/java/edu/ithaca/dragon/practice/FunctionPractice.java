package edu.ithaca.dragon.practice;

import java.util.List;

import scala.math.BigDecimal;
import java.math.RoundingMode;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third) {
        // Check if any of the numbers is negative
        if (first < 0 || second < 0 || third < 0) {
            throw new IllegalArgumentException("All numbers must be non-negative");
        }

        // Find and return the largest of the three numbers
        int largest = first;
        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }
        return largest;
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        // Calculate the price after applying the discount
        double discountedPrice = originalPrice * (1 - discountPercent / 100.0);
        
        // Calculate the final price after adding sales tax
        double finalPrice = discountedPrice * (1 + salesTax / 100.0);
        
        // Round the final price to the nearest hundredth
        double roundedPrice = Math.round(finalPrice * 100.0) / 100.0;
        
        return roundedPrice;  
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}