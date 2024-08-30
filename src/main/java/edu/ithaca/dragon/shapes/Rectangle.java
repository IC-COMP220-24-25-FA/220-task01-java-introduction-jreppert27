package edu.ithaca.dragon.shapes;

public class Rectangle {
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
        this.length = length * 2;
        this.width = width * 2;
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
