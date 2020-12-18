package com.vladbrown.core.model.service.orderService;

import com.vladbrown.core.model.entity.Cart;
import com.vladbrown.core.model.entity.DayPlan;
import com.vladbrown.core.model.entity.Order;
import com.vladbrown.core.model.entity.Plan;

public interface OrderService {

    Order createOrder(Cart cart);

    Order createOrder(Plan plan);

    Order createOrder(DayPlan dayPlan);

    void placeOrder(Order order);
}
