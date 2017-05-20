package ru.itpark.service;


import ru.itpark.models.Car;
import java.util.List;

public interface CarsService {
    boolean hasName(int carId, String name);
    Car getCarById(int carId);
    void register(Car car);
    List<Car> getListOfCars();
    void removeCar(int id);
    void update(Car car);
}

