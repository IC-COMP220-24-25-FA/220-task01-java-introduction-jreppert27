package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.PI * radius * radius;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *= Math.sqrt(2);
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return (radius * 2);
    }
}
