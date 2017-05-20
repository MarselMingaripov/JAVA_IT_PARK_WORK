package ru.itpark.service;

import ru.itpark.dao.CarsDao;
import ru.itpark.models.Car;

import java.util.List;

public class CarsServiceImpl implements CarsService {

    private CarsDao carsDao;

    public CarsServiceImpl(CarsDao carsDao) {

        this.carsDao = carsDao;
    }


    public boolean hasName(int carId, String name) {
        Car car = (Car) carsDao.find(carId);
        return car.getName().equals(name);
    }

    public Car getCarById(int carId) {

        return (Car) carsDao.find(carId);
    }


    public void register(Car car) {

        System.out.println("CAR ID " + carsDao.save(car));
    }

    public List<Car> getListOfCars() {

        return carsDao.findAll();
    }

    public void removeCar(int id) {

        carsDao.delete(id);
    }

    public void update(Car car) {

        carsDao.update(car);
    }
}
