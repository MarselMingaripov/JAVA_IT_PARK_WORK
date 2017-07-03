package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.models.Food;
import ru.itpark.models.Order;
import ru.itpark.services.FoodService;
import ru.itpark.services.OrderService;

import java.util.List;

@Controller
public class FreemarkerController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/food/ftl")
    public String getFood(@ModelAttribute("model")ModelMap model,
                            @RequestParam("cost") int cost){
        List<Food> foods = foodService.getFoodByCost(cost);
        model.addAttribute("food", foods);
        return "food";
    }

    @GetMapping(value = "/order/ftl")
    public String getOrder(@ModelAttribute("order")ModelMap order){
        List<Order> orders = orderService.getAllOrder();
        order.addAttribute("order", orders);
        return "order";
    }
}
