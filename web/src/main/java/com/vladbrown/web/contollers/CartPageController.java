package com.vladbrown.web.contollers;

import com.vladbrown.core.model.service.cartService.HttpSessionCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart")
public class CartPageController {

    @Autowired
    private HttpSessionCartService httpSessionCartService;

    @GetMapping
    public String showHomePage() {
        return "cartPage";
    }
}
