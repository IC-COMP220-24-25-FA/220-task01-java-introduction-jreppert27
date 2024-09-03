package edu.ithaca.dragon.shapes;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        List<Rectangle> rectList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            int randomNumber1 = (int) (Math.random() * 10) + 1;
            int randomNumber2 = (int) (Math.random() * 10) + 1;
            Rectangle newRectangle = new Rectangle(randomNumber1, randomNumber2);
            rectList.add(newRectangle);
        }
        for (int i = 0; i < 5; i++){
            System.out.println("Rectangle " + (i+1) + ": " + rectList.get(i));
        }
        
        //Allow the user to choose one, double the size of that one, and print them all again

        //Use a loop to repeat the process 5 times
        for (int i = 0; i < 5; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a Rectangle 1-5:");
            int userInt = scanner.nextInt();

            Rectangle newRect = rectList.get(userInt -1);
            newRect.doubleSize();

            for (int j = 0; j < 5; j++){
                System.out.println("Rectangle " + (j+1) + ": " + rectList.get(j));
            }
        }
    }
}
