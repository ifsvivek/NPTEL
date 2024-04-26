package dev.eas;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private static Map<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();

    public static void main(String[] args) {
        Course jmc = new Course("jmc101", "Java Classes", "Java");
        Course python = new Course("pyt101", "Python Classes", "Python");

        addPurchase("Sunny", jmc, 500.00);
        addPurchase("Krishna", jmc, 699.99);
        addPurchase("Bala", python, 549.99);
        addPurchase("Radha", jmc, 450.99);
        addPurchase("Radha", python, 700.00);

        addPurchase("Kanika", python, 459.99);
        addPurchase("Gopal", jmc, 650.99);
        addPurchase("Rama", python, 499.99);
        addPurchase("Sita", jmc, 600.99);
        addPurchase("Laxman", python, 749.99);

        purchases.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("------------------------------");
        students.forEach((key, value) -> System.out.println(key + ": " + value));

        NavigableMap<LocalDate, List<Purchase>> datedPurchases = new TreeMap<>();
        for(Purchase p : purchases.values()) {
            datedPurchases.compute(p.purchaseDate(),
                    (pdate, plist) -> {
                        List<Purchase> list = (plist == null) ? new ArrayList<>() : plist;
                        list.add(p);
                        return list;
                    });
        }
        datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private static void addPurchase(String name, Course course, double price) {
        Student existingStudent = students.get(name);
        if(existingStudent == null) {
            existingStudent = new Student(name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1,15);
//        int day = purchases.size() + 1;
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(), existingStudent.getId(), price, year, day);
        purchases.put(key, purchase);


    }
}
