package ru.itpark.models;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String cathegory;

    @Column
    private String name;

    @Column
    private int cost;

    public Food() {
    }

    public Food(String cathegory, String name, int cost) {
        this.cathegory = cathegory;
        this.name = name;
        this.cost = cost;
    }

    public Food(int id, String cathegory, String name, int cost) {
        this.id = id;
        this.cathegory = cathegory;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id + " " + cathegory + " " + name + " " + cost;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Food)) {
            return false;
        }

        Food that = (Food) object;

        return this.id == that.id &&
                this.cathegory == that.cathegory &&
                this.name.equals(that.name) &&
                this.cost == that.cost;
    }
}
