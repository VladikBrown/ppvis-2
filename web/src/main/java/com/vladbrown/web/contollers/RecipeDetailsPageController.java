package com.vladbrown.web.contollers;

import com.vladbrown.core.model.entity.Recipe;
import com.vladbrown.core.model.service.recipeService.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipeDetails")
public class RecipeDetailsPageController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/{recipeId}")
    public String showHomePage(@PathVariable String recipeId) {
        return "recipeDetailsPage";
    }
}
