package edu.ithaca.dragon.shapes;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        if (baseIn <= 0 & heightIn <= 0) {
            throw new IllegalArgumentException("Base and Height must be positive numbers.");
        }
        base = baseIn;
        height = heightIn;
    }

    public double calcArea(){
        return (base * height * 0.5);
    }

    public void doubleSize(){
        base *= Math.sqrt(2);
        height *= Math.sqrt(2);
    }

    public double longestLineWithin(){
        double halfBase = base / 2.0;
        return Math.sqrt(Math.pow(halfBase, 2) + Math.pow(height, 2));
        
    }
}
