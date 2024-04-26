public class Main {
    public static void main(String[] args) {
        //creating an object
        Car car =  new Car();
//        Car car1 = new Car(); // values of instances will be different from car
        // Car - class name
        // car - object name
        // new - keyword - must
        // Car (); -> constructor
//        car.make = "Tata";
//        car.model = "Neon";
//        car.getMake();

        car.describeCar();
        //setter and getter ()

        // 0- doors null null null
        // 0 - int
        // null - for any String variable - String is not a primitve data type
        // convertible - false
        car.setMake("Tesla");
        car.setModel("ModelX");
        car.setColor("red");
        car.setDoors(4);
        car.setConvertible(false);
        car.describeCar();

        Car targa = new Car();
        targa.setMake("TAta");
        targa.setModel("Targa");
        targa.setColor("Black");
        targa.setDoors(3);
        targa.setConvertible(true);
        targa.describeCar();

        // constructors


    }
}
