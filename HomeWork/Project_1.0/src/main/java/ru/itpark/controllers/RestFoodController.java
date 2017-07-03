package ru.itpark.controllers;

import org.hibernate.annotations.ParamDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.models.Food;
import ru.itpark.services.FoodService;

import java.util.List;

@RestController
public class RestFoodController {

    @Autowired
    private FoodService service;

    @GetMapping("/foods")
    public List<Food> getFoods(@RequestParam("cost") int cost) {
        return service.getFoodByCost(cost);
    }

    @GetMapping(value = "food/{food-id}", params = "select=foodId")
    public Food getFoodById(@PathVariable("food-id")int foodId){
        return service.findFood(foodId);
    }

    @PostMapping(value = "food/putFood")
    public Integer putFood(@RequestBody Food food){
        return service.saveFood(food);
    }
}
