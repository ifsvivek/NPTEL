/*
 * Implement two classes, Car and Bike, that implement the Vehicle interface.
 * Each class should have appropriate attributes and constructors.
 * Ensure that the start, accelerate, and brake methods are implemented
 * correctly for each vehicle.
 */

import java.util.Scanner;

interface Vehicle {
    void start();

    void accelerate();

    void brake();
}

// from here
class Car implements Vehicle {
    private int numDoors;

    public Car(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println("Car with " + numDoors + " doors started");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating to 60 mph");
    }

    @Override
    public void brake() {
        System.out.print("Applying brakes");
    }
}

class Bike implements Vehicle {
    private int numWheels;

    public Bike(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void start() {
        System.out.println("Bike with " + numWheels + " wheels started");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating to 40 mph");
    }

    @Override
    public void brake() {
        System.out.print("Applying brakes");
    }
}
// till here

public class W12_P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        // Fixed code: Prefix
        Vehicle vehicle = null;
        switch (vehicleType) {
            case "Car":
                int numDoors = scanner.nextInt();
                vehicle = new Car(numDoors);
                break;
            case "Bike":
                int numWheels = scanner.nextInt();
                vehicle = new Bike(numWheels);
                break;
            default:
                System.out.println("Invalid vehicle type");
                scanner.close();
                System.exit(1);
        }
        if (vehicle != null) {
            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
        }
        scanner.close();
    }

}