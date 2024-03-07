/*
 * An interface shape is provided,
 * Your task is to make the following:
 * Create a class "Circle" that implements the "Shape" interface and provides
 * its own implementation for calculateArea().
 * 
 * @Override the area function to compute the area of a circle (Use Math.PI for
 * value of pi, not 22/7)
 * Create another class "Rectangle" that implements the "Shape" interface and
 * provides its own implementation for calculateArea().
 * 
 * @Override the area function to compute the area of a rectangle
 */

package Week7;

import java.util.Scanner;

interface Shape {
    double calculateArea();
}

// from here
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
// to here

class NPTEL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the Circle class
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Test the Rectangle class
        double rectangleLength = scanner.nextDouble();
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.print("Rectangle Area: " + rectangle.calculateArea());

        scanner.close();
    }
}