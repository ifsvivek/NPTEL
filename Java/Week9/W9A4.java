/*
 * Define a class Point with members
 * 
 * § private double x;
 * 
 * § private double y;
 * 
 * and methods:
 * 
 * § public Point(double x, double y){} // Constructor to create a new point?
 * 
 * § public double distance(Point p2){} // Function to return the distance of
 * this Point from another Point
 */


import java.util.Scanner;
// from here
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
    }
}
// to here

public class W9A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.print(p1.distance(p2));
    }
}