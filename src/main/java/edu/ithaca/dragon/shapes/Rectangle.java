package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if (length <= 0 & width <= 0) {
            throw new IllegalArgumentException("Length and Width must be positive numbers.");
        }
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       return length * width;
    }

    public void doubleSize(){
        this.length = length * Math.sqrt(2);
        this.width = width * Math.sqrt(2);
    }

    public double longestLineWithin(){
        return (Math.sqrt((length * length) + (width * width)));
    }
    
    public String toString(){
        return "RECTANGLE *** Area= " + this.calcArea() + ", Longest Line Within= " + this.longestLineWithin();
    }
}
