package com.vladbrown.web.contollers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcomePage")
public class WelcomePageController {

    @GetMapping
    public String showWelcomePage() {

        return "welcomePage";
    }
}
