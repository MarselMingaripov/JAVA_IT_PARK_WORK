package ru.itpark.services;


import ru.itpark.models.Food;

import java.util.List;

public interface FoodService {
    List<Food> getAllFood();
    int saveFood(Food name);
    Food findFood(int id);
    void updateFood(Food name);
    void deleteFood(int id);
    List<Food> getFoodByCost(int cost);
}
