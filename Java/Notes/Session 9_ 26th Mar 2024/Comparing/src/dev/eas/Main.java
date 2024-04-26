package dev.eas;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for(Integer i: others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo= %d%n", five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }

//        String banana = "banana";
//        String[] fruits = {"apple", "banana", "pear", "BANANA"};
//        for(String s: fruits) {
//            int val = banana.compareTo(s);
//            System.out.printf("%s %s %s: compareTo= %s%n", banana,
//                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
//        }
////
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
////
//        System.out.println("A: " + (int)'A' + " " + "a: " + (int)'a');
//        System.out.println("B: " + (int)'B' + " " + "b: " + (int)'b');
//        System.out.println("P: " + (int)'P' + " " + "p: " + (int)'p');
////
//        Student eas = new Student("Eashaan");
//        Student[] students = {new Student("Rahul"), new Student("Divya"),
//                new Student("Eashaan")};
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
////
////        System.out.println("result = " +  eas.compareTo("Mary"));
//        System.out.println("result = " +  eas.compareTo(new Student("EASHAAN")));
////
//        Comparator<Student> gpaSorter = new StudentGPAComparator();
//        Arrays.sort(students, gpaSorter.reversed()); // add reversed()
//        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name); // ascending
//        return (o2.gpa + o2.name).compareTo(o1.gpa + o1.name); // descending
    }
}

class Student implements Comparable<Student>{ //add implements comparable

    private static int LAST_ID =1000;
    private static Random random = new Random();
//    private String name;
    String name;
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
//        return name;
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }



    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
//        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
