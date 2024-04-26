package dev.eas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysandArrayLists {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: "+ originalList);
        System.out.println("Array: "+ Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Array: "+ Arrays.toString(originalArray));

        //let's try to remove an element from list which originally an Array
//        originalList.remove(0);

        //let's try to add one
//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }



}
