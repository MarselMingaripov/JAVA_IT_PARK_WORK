package ru.itpark.models;


public class Car {
    private int id;
    private String name;
    private int cost;

    public Car(int id, String name, int cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public Car(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString() {
        return id + " " + name + " " + cost;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Car)) {
            return false;
        }

        Car that = (Car) object;

        return this.id == that.id &&
                this.cost == that.cost &&
                this.name.equals(that.name);
    }

}
