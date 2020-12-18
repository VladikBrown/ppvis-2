package com.vladbrown.core.model.dao.food;

import com.vladbrown.core.model.entity.Food;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodDaoImpl implements FoodDao {
    @Override
    public Food findById(Long id) {
        return null;
    }

    @Override
    public List<Food> getAll() {
        return null;
    }

    @Override
    public void save(Food food) {

    }

    @Override
    public void update(Food food) {

    }

    @Override
    public void delete(Food food) {

    }
}
