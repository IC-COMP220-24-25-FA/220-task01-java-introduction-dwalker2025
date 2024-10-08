package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape {
    public double length;
    public double width;
    

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

        if (length <= 0 || width <= 0){
            throw new IllegalArgumentException("Length and Width have to be postive.");
        }

    }

    public double calcArea(){
        return length * width;
    }

    public void doubleSize(){
        length = length * 2;
        width =  width * 2;
    }

    public double longestLineWithin(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
    }

    public String toString(){
        String rect_info;
        rect_info = "This is a Rectangle and it's length is: " + length + " and width is: " + width;

        return rect_info;
    }
}
