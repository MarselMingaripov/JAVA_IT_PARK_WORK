
public class Car extends Transport implements ParkingObject {

    public Car(String number, String model) {
        super(number, model);
    }


    public String getModel() {
        return this.model;
    }

    public String getNumber() {
        return this.number;
    }

    public void parking() {
        System.out.println("Паркуюсь");
        ParkingPlace.parking(this.getModel());
    }

    public void unparking() {
        System.out.println("Уезжаю");
        ParkingPlace.unparking(getModel());
    }
}
