public class Main {

    public static void main(String[] args) {
        Car car = new Car("123", "BMW");
        Motobike motobike = new Motobike("456", "Honda");
        Bicycle bicycle = new Bicycle("789", "Stels");

        car.parking();
        motobike.parking();
        bicycle.parking();

        car.unparking();
        motobike.unparking();
        bicycle.unparking();
    }
}

