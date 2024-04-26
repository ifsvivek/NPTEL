package dev.eas;

public class Dog extends Mammal{ // change to Mammal or Animal

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")) {
            System.out.println(getExplicitType() + " is walking.");
        } else {
            System.out.println(getExplicitType() + " is running.");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds hair all the time");
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf") {
            System.out.print(" Howling! ");
        } else {
            System.out.print(" Woof!! ");
        }
    }

//    @Override
//    public String getExplicitType() {
//        return " ";
//    }
}
