package com.vladbrown.web.contollers;

import com.vladbrown.core.model.dao.food.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foodDetails")
public class FoodDetailsPageController {

    @Autowired
    private FoodDao foodDao;

    @GetMapping("{foodId}")
    public String showFoodDetails(@PathVariable String foodId) {
        return "foodDetails";
    }
}
