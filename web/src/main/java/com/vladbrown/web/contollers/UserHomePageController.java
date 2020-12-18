package com.vladbrown.web.contollers;

import com.vladbrown.core.model.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/userHome")
public class UserHomePageController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showUserDetails(HttpSession httpSession) {
        return "UserHomePage";
    }
}
