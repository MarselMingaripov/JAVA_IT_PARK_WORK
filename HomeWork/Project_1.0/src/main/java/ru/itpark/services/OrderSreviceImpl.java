package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itpark.dao.OrderDao;
import ru.itpark.models.Order;

import java.util.List;

@Component
public class OrderSreviceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> getAllOrder() {
        return orderDao.findAll();
    }

    @Override
    public int saveOrder(Order name) {
        return orderDao.save(name);
    }

    @Override
    public Order findOrder(int id) {
        return orderDao.find(id);
    }

    @Override
    public void updateOrder(Order name) {
        orderDao.update(name);

    }

    @Override
    public void deleteOrder(int id) {
        orderDao.delete(id);

    }
}
