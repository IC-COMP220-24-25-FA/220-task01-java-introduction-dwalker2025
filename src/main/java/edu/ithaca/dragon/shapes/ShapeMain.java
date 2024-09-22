package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeMain {

    public static void main(String[] args) {
        Random random = new Random();
        List<Rectangle> rectangles = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            double width = 1 + random.nextDouble() * 9;
            double length = 1 + random.nextDouble() * 9;
            rectangles.add(new Rectangle(width, length));
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("Iteration " + (j + 1) + ":");
            for (int i = 0; i < rectangles.size(); i++) {
                Rectangle rect = rectangles.get(i);
                double area = rect.calcArea();
                double diagonal = rect.longestLineWithin();
                System.out.printf("Rectangle %d: Area = %.2f, Diagonal = %.2f\n", i + 1, area, diagonal);
            }


            int selectedIndex = random.nextInt(rectangles.size());
            rectangles.get(selectedIndex).doubleSize();
            System.out.println("Rectangle " + (selectedIndex + 1) + " was selected and doubled in size.\n");
        }


        System.out.println("Final list of rectangles:");
        for (int i = 0; i < rectangles.size(); i++) {
            Rectangle rect = rectangles.get(i);
            double area = rect.calcArea();
            double diagonal = rect.longestLineWithin();
            System.out.printf("Rectangle %d: Area = %.2f, Diagonal = %.2f\n", i + 1, area, diagonal);
        }

        List<Shape> shapes = new ArrayList<>();
        Random random2 = new Random();

// add 10 random shapes to the list
        for (int i = 0; i < 10; i++) {
            Shape shape;
            if (random2.nextBoolean()) {
                shape = new Circle(1.0);
            } else if (random2.nextBoolean()) {
                shape = new Rectangle(2.0, 3.0);
            } else {
                shape = new Triangle(3.0, 4.0, 5.0);
            }
            shapes.add(shape);
        }

// Print using toString()
        System.out.println("Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

// Double the size and print
        System.out.println("\nDoubled Shapes:");
        for (Shape shape : shapes) {
            shape.doubleSize();
            System.out.println(shape.toString());
        }
    }
}


