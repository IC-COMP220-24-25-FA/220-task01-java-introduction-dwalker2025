package edu.ithaca.dragon.shapes;

public class Circle {
    double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
        if (radius <= 0){
            throw new IllegalArgumentException("Can't be non positive number.");
        }
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
       radius =  radius * 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double diameter;
        diameter = radius * 2;
        return diameter;

    }
}
