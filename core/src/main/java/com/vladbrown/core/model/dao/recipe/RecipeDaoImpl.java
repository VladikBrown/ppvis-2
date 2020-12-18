package com.vladbrown.core.model.dao.recipe;

import com.vladbrown.core.model.entity.Recipe;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeDaoImpl implements RecipeDao {

    @Override
    public Recipe findById(Long id) {
        return null;
    }

    @Override
    public List<Recipe> getAll() {
        return null;
    }

    @Override
    public void save(Recipe recipe) {

    }

    @Override
    public void update(Recipe recipe) {

    }

    @Override
    public void delete(Recipe recipe) {

    }
}
