package com.vladbrown.core.model.service.recipeService;

import com.vladbrown.core.model.dao.recipe.RecipeDao;
import com.vladbrown.core.model.entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeDao recipeDao;

    @Override
    public Recipe get(Long id) {
        return null;
    }

    @Override
    public List<Recipe> getAll() {
        return null;
    }

    @Override
    public Recipe updateRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe create(Recipe recipe) {
        return null;
    }

    @Override
    public void delete(Recipe recipe) {

    }
}
