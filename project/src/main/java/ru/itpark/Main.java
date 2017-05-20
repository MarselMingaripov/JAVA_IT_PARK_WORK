package ru.itpark;


import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import ru.itpark.models.Car;
import ru.itpark.service.CarsService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("dev");
        context.load("ru.itpark\\context.xml");
        context.refresh();
        CarsService carsService = context.getBean(CarsService.class);
        Car car = new Car("Bugatti", 15000);
        carsService.register(car);
       //Car carFromBd = carsService.getCarById(9);
        //System.out.println(carFromBd.getId() + " " + carFromBd.getName() + " " + carFromBd.getCost());

        //List<Car> cars = carsService.getListOfCars();
        //System.out.println(cars);
       // carsService.removeCar(14);
       Car lena = new Car(7, "odin", 5000);
        carsService.update(lena);
    }
}
