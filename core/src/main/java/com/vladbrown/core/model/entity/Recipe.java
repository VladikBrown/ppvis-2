package com.vladbrown.core.model.entity;

import java.util.List;

public class Recipe extends Product {

    private String recipeDescription;

    private List<Food> foodList;

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
