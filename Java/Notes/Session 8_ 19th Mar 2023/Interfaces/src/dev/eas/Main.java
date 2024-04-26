package dev.eas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTravelled = 100;
        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTravelled, milesTravelled);

        ArrayList<FlightEnabled> fliers = new ArrayList<>(); // change to linkedlist
        fliers.add(bird);

        List<FlightEnabled> betterfliers = new ArrayList<>();
        betterfliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterfliers);
        flyFliers(betterfliers);
        landFliers(betterfliers);
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers) { // changing arraylist to list
        for(var flier: fliers) {
            flier.takeOff();
        }
    }
    private static void flyFliers(List<FlightEnabled> fliers) { // changing arraylist to list
        for(var flier: fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) { // changing arraylist to list
        for(var flier: fliers) {
            flier.land();
        }
    }
}
