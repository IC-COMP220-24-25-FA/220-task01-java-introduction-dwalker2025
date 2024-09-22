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
    }
}

