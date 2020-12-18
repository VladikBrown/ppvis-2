package com.vladbrown.core.model.service.orderService;

import com.vladbrown.core.model.dao.order.OrderDao;
import com.vladbrown.core.model.entity.Cart;
import com.vladbrown.core.model.entity.DayPlan;
import com.vladbrown.core.model.entity.Order;
import com.vladbrown.core.model.entity.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order createOrder(Cart cart) {
        return null;
    }

    @Override
    public Order createOrder(Plan plan) {
        return null;
    }

    @Override
    public Order createOrder(DayPlan dayPlan) {
        return null;
    }

    @Override
    public void placeOrder(Order order) {

    }
}
