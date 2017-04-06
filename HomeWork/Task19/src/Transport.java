public abstract class Transport implements ParkingObject {

    protected String model;
    protected String number;

    public Transport(String number, String model) {
        this.number = number;
        this.model = model;
    }


}
