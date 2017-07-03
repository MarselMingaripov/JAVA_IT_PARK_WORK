package ru.itpark.services;


import ru.itpark.models.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrder();
    int saveOrder(Order name);
    Order findOrder(int id);
    void updateOrder(Order name);
    void deleteOrder(int id);
}
