package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itpark.dao.FoodDao;
import ru.itpark.models.Food;

import java.util.List;

@Component
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;
    @Override
    public List<Food> getAllFood() {

        return foodDao.findAll();
    }

    @Override
    public int saveFood(Food name) {

        return foodDao.save(name);
    }

    @Override
    public Food findFood(int id) {

        return foodDao.find(id);
    }

    @Override
    public void updateFood(Food name) {
        foodDao.update(name);

    }

    @Override
    public void deleteFood(int id) {
        foodDao.delete(id);

    }

    @Override
    public List<Food> getFoodByCost(int cost) {

        return foodDao.FindAllByCost(cost);
    }
}
