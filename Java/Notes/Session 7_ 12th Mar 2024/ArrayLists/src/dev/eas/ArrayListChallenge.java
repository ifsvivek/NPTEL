package dev.eas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries =  new ArrayList<>();
        while(flag) {
            printActions();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);

        }

    }
    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add Item(s) [Separate items by comma]: ");
        String[] items = sc.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for(String i: items) {
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove Item(s) [Separate items by comma]: ");
        String[] items = sc.nextLine().split(",");

        for(String i: items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);

        }
    }


    private static void printActions(){
        String textBlock = """
                Available Actions:
                
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}
