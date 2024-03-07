/*
 * Two interfaces are provided, namely Flyable and Swimmable,
 * Your task is to make the following:
 * Create a class "FlyingFish" that implements both interfaces and provides its
 * own implementation for fly() and swim()
 * It should have a private variable name, use a constructor to set the value
 * and the functions fly() and swim() to print exactly as given in the test
 * case.
 */

package Week7;

import java.util.Scanner;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}
// from here
class FlyingFish implements Flyable, Swimmable {
    private String name;

    public FlyingFish(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.print(name + " can glide through the air\n");
    }
    
    @Override
    public void swim() {
        System.out.print(name + " can swim in water");
    }
}
// to here
public class W7A5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the name of the fish: ");
        String fishName = scanner.nextLine();

        FlyingFish flyingFish = new FlyingFish(fishName);

        // Test the FlyingFish class
        flyingFish.fly();
        flyingFish.swim();

        scanner.close();
    }
}