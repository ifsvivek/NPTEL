/*
 * Write a Java program to calculate the area of different shapes using
 * inheritance.
 * 
 * Each shape should extend the abstact class Shape
 * 
 * Your task is to make the following classes by extending the Shape class:
 * 
 * § Circle (use Math.PI for area calculation)
 * 
 * § Rectangle
 * 
 * § Square
 * 
 * Each Shape subclass should have these private variables apart from the
 * private variables for storing sides or radius.
 * 
 * private String shapeType;
 * private double area;
 * 
 * Follow the naming convention as given in the main method of the suffix code.
 */

import java.util.Scanner;

abstract class Shape {
    protected abstract void calcArea();

    public abstract void printArea();
}

// from here
class Circle extends Shape {
    private String shapeType;
    private double area;
    private double radius;

    public Circle(String shapeType, double radius) {
        this.shapeType = shapeType;
        this.radius = radius;
    }

    @Override
    protected void calcArea() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void printArea() {
        System.out.print("Area of " + this.shapeType + ": " + this.area);
    }
}

class Rectangle extends Shape {
    private String shapeType;
    private double area;
    private double length;
    private double width;

    public Rectangle(String shapeType, double length, double width) {
        this.shapeType = shapeType;
        this.length = length;
        this.width = width;
    }

    @Override
    protected void calcArea() {
        this.area = this.length * this.width;
    }

    @Override
    public void printArea() {
        System.out.print("Area of " + this.shapeType + ": " + this.area);
    }
}

class Square extends Shape {
    private String shapeType;
    private double area;
    private double side;

    public Square(String shapeType, double side) {
        this.shapeType = shapeType;
        this.side = side;
    }

    @Override
    protected void calcArea() {
        this.area = Math.pow(this.side, 2);
    }

    @Override
    public void printArea() {
        System.out.print("Area of " + this.shapeType + ": " + this.area);
    }
}
// till here

public class W12_P4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter shape type (Circle, Rectangle or Square): ");
        String shapeType = scanner.nextLine();
        // System.out.print("Enter first dimension: ");
        double arg1 = scanner.nextDouble();
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle(shapeType, arg1);
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            double arg2 = scanner.nextDouble();
            shape = new Rectangle(shapeType, arg1, arg2);
        } else if (shapeType.equalsIgnoreCase("Square")) {
            shape = new Square(shapeType, arg1);
        } else {
            System.out.println("Invalid shape type");
            scanner.close();
            return;
        }
        shape.calcArea();
        shape.printArea();
        scanner.close();
    }
}