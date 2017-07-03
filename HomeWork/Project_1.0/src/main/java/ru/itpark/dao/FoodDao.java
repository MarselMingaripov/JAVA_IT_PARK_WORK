package ru.itpark.dao;


import ru.itpark.models.Food;

import java.util.List;

public interface FoodDao extends BaseCrudDao<Food> {
    List<Food> FindAllByCost(int cost);
}
