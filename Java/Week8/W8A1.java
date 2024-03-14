/*
 * Create a class called Animal with protected fields and a parameterized
 * constructor to initialize the protected fields.
 * Fields:
 * name (String)
 * sound (String)
 * and Method:
 * public void makeSound() - This method should display the name of the animal
 * and the sound it makes.
 * Create a class called Dog that extends the Animal class.
 * The Dog class should have a constructor that accepts the name of the dog and
 * sets the sound to "Woof".
 * 
 * Create a class called Cat that extends the Animal class.
 * The Cat class should have a constructor that accepts the name of the cat and
 * sets the sound to "Meow".
 */

import java.util.Scanner;

// from here
class Animal {
    protected String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name, "Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, "Meow");
    }
}

// to here
class W08_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogName = scanner.nextLine();
        String catName = scanner.nextLine();

        Dog dog = new Dog(dogName);
        Cat cat = new Cat(catName);

        dog.makeSound();
        cat.makeSound();

        scanner.close();
    }
}