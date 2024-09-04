package edu.ithaca.dragon.shapes;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        List<Shape> shapeList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int randomNumber1 = (int) (Math.random() * 10) + 1;
            int randomNumber2 = (int) (Math.random() * 10) + 1;
            int choice = (int)(Math.random() * 3); // Generates a random number 0, 1, or 2
            switch (choice) {
                case 0: //Rectangle
                    Shape newRect = new Rectangle(randomNumber1, randomNumber2);
                    shapeList.add(newRect);
                    break;
                case 1: //Triangle
                    Shape newTriangle = new Triangle(randomNumber1, randomNumber2);
                    shapeList.add(newTriangle);
                    break;
                case 2: //Circle
                    Shape newCircle = new Circle(randomNumber1);
                    shapeList.add(newCircle);
                    break;
        }
        }
        for (int j = 0; j < 10; j++){
            System.out.println("Shape " + (j+1) + ": " + shapeList.get(j));
        }
        
        //Allow the user to choose one, double the size of that one, and print them all again

        //Use a loop to repeat the process 5 times
        for (int l = 0; l < 10; l++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a Shape 1-10:");
            int userInt = scanner.nextInt();

            Shape newShape = shapeList.get(userInt -1);
            newShape.doubleSize();

            for (int j = 0; j < 10; j++){
                System.out.println("Rectangle " + (j+1) + ": " + shapeList.get(j));
            }
        }
    
    }
}
