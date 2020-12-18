package com.vladbrown.core.model.service.recipeService;

import com.vladbrown.core.model.entity.Recipe;

import java.util.List;

public interface RecipeService {

    Recipe get(Long id);

    List<Recipe> getAll();

    Recipe updateRecipe(Recipe recipe);

    Recipe create(Recipe recipe);

    void delete(Recipe recipe);
}
