package com.vladbrown.core.model.dao.order;

import com.vladbrown.core.model.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public Order findById(Long id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(Order order) {

    }
}
