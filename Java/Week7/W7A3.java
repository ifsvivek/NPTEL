/*
 * An abstract class shape is provided,
 * Your task is to make the following:
 * a parameterized constructor to initialize the Circle class
 * 
 * @Override the area function to compute the area of a circle (Use Math.PI for
 * value of pi, not 22/7)
 * 
 * @Override the displayInfo() function to print exactly in the format provided
 * by the test cases.
 */

package Week7;

import java.util.Scanner;

abstract class Shape {
    public abstract double area();

    public void displayInfo() {
        System.out.println("Shape - Area: " + area());
    }
}

final class Circle extends Shape {
    private double radius;
    // from here
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.print("Circle - Radius: "+radius+", Area: "+ area());
    }

    // to here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayInfo();

        scanner.close();
    }
}