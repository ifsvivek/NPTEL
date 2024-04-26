package dev.eas.burger;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private double price = 5.0; // change base to price
//    private Item burger;
    private Burger burger;
    private Item drink;
    private Item side;

    private double conversionRate;

    public Meal(){
        this(1);
    }

    public Meal(double conversionRate){
        this.conversionRate = conversionRate;
//        burger = new Item("regular", "burger");
        burger = new Burger("regular");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    public double getTotal(){
//        double total = burger.price + drink.price + side.price;
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
//        return "%s%n%s%n%s%n".formatted(burger, drink, side);
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total Due: ", getTotal());
    }

    public void addToppings(String... selectedToppings) {
        burger.addToppings(selectedToppings);
    }

    private class Item {
        private String name;
        private String type;
        private double price;


        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0); //change base to price -> Meal.this.price
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
//            return "%10s%15s $%.2f".formatted(type, name, price);
            return "%10s%15s $%.2f".formatted(type, name, getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate){
            return price * rate;
        }
    }

    private class Burger extends Item {
        private enum Extra {AVACADO, CHEESE, KETCHUP, MAYO, MUSTARD, PICKLES;

            private double getPrice() {
                return switch(this) {
                    case AVACADO -> 1.0;
                    case CHEESE -> 1.5;
                    default -> 0;
                };
            }
        }

        private List<Item> toppings = new ArrayList<>();
        Burger(String name) {
            super(name, "burger", 5.0);
        }

        public double getPrice() {
//            return super.price;
            double total = super.price;
            for (Item topping : toppings) {
                total += topping.price;
            }
            return total;
        }

        private void addToppings(String... selectedToppings) {
            for(String selectedTopping : selectedToppings) {
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING", topping.getPrice()));
                } catch (IllegalArgumentException ie) {
                    System.out.println("No Topping found for " + selectedTopping);
                }

            }
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            for(Item topping : toppings) {
                itemized.append("\n");
                itemized.append(topping);
            }
                return itemized.toString();

        }

    }

}
