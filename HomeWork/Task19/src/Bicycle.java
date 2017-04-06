public class Bicycle extends Transport implements ParkingObject {

    public Bicycle(String number, String model) {
        super(number, model);
    }


    public String getModel() {
        return this.model;
    }

    public String getNumber() {
        return "null";
    }

    public void parking() {
        System.out.println("Не паркуюсь");
        System.out.println();
    }

    public void unparking() {
    }
}
