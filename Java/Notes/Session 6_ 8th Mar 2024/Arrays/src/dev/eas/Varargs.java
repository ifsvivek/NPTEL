package dev.eas;

public class Varargs {
    public static void main(String... args) {
        System.out.println("Hello World Again!");
        String[] splitsString = "Hello World Again".split(" ");
        printText(splitsString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "Earth", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {
        for(String t : textList) {
            System.out.println(t);
        }
    }
}
