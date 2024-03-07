/*
 * A Student class with private fields (name, age) is provided,
 * Your task is to make the following:
 * a parameterized constructor to initialize the private fields
 * the getter/setter methods for each field
 * Follow the naming convention as given in the main method of the suffix code.
 */

package Week7;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    // From here
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // to here

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        Student student = new Student(name, age);
        System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());

        scanner.close();
    }
}