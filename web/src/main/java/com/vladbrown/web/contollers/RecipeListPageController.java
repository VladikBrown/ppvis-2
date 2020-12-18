package com.vladbrown.web.contollers;

import com.vladbrown.core.model.service.recipeService.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipeList")
public class RecipeListPageController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public String showHomePage() {
        return "recipeListPage";
    }
}
