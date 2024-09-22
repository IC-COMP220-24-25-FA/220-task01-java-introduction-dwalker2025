package edu.ithaca.dragon.shapes;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("All sides must be positive.");
        }
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("The provided sides do not form a valid triangle.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Method to calculate the area using Heron's formula
    public double calcArea() {
        double s = (sideA + sideB + sideC) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Method to double the size of the triangle
    public void doubleSize() {
        sideA *= 2;
        sideB *= 2;
        sideC *= 2;
    }

    // Method to find the longest line within the triangle (the longest side)
    public double longestLineWithin() {
        return Math.max(sideA, Math.max(sideB, sideC));
    }

    // Helper method to check if the sides form a valid triangle
    private boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

    public String toString(){
        String tri_info;
        tri_info = "This is a Triangle and the size of side A is: " + sideA + " Side B is: " + sideB + " and side C is: " + sideC;

        return tri_info;
    }

}

