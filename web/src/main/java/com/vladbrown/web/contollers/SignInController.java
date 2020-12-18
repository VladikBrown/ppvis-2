package com.vladbrown.web.contollers;

import com.vladbrown.core.model.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signIn")
public class SignInController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String signIn() {
        return "signInPage";
    }
}
