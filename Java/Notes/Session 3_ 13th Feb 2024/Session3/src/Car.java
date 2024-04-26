public class Car {
    // state/ fields/ variables/ attributes
    private String make;
    private String model = " Careera";
    private String color = " red";
    private int doors = 2;
    private boolean convertible = true;

    // private - access specifiers /modifiers (how to access varibale/ methods)
    // protected
    // public  (most usedly)
    // default
    // static
    // attributes - private, methods - public (in some cases private)

    public String getMake(){  // getter function
//        System.out.println("Make: " + make);
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    // method
    void describeCar() {
        System.out.println(doors + "- doors " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }

}
